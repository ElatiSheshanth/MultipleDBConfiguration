package com.app.service.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.app.entity.mongo.common.Users;

@Service
public class UsersService {

	@Autowired
	@Qualifier("db1MongoTemplate")
	MongoTemplate db1MongoTemplate;

	public Users addUser(Users userR) {
		Query searchUserQuery = new Query(Criteria.where("id").is(userR.getId()));
		Users savedUser = db1MongoTemplate.findOne(searchUserQuery, Users.class);
		if (savedUser != null)
			return null;
		db1MongoTemplate.save(userR);
		return userR;
	}

	public List<Users> getUsers() {
		List<Users> users = db1MongoTemplate.findAll(Users.class,"users");
		
		return users;
	}

	public Users updateUser(Users updateUserR) {

		Query searchUserQuery = new Query(Criteria.where("id").is(updateUserR.getId()));
		Users savedUser = db1MongoTemplate.findOne(searchUserQuery, Users.class);
		if (savedUser == null)
			return null;
		db1MongoTemplate.save(updateUserR);
		return updateUserR;
	}

}