package com.app.service.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.mongo.common.Users2;

@Service
@Transactional
public class UsersService2 {

	@Autowired
	@Qualifier("db2MongoTemplate")
	MongoTemplate db2MongoTemplate;


	public Users2 addUser2(Users2 userR) {
		Query searchUserQuery = new Query(Criteria.where("id").is(userR.getId()));
		Users2 savedUser = db2MongoTemplate.findOne(searchUserQuery, Users2.class);
		if (savedUser != null)
			return null;
		db2MongoTemplate.save(userR);
		return userR;
	}

	public List<Users2> getUsers2() {
		List<Users2> users = db2MongoTemplate.findAll(Users2.class);

		return users;
	}

	public Users2 updateUser2(Users2 updateUserR) {

		Query searchUserQuery = new Query(Criteria.where("id").is(updateUserR.getId()));
		Users2 savedUser = db2MongoTemplate.findOne(searchUserQuery, Users2.class);
		if (savedUser == null)
			return null;
		db2MongoTemplate.save(updateUserR);
		return updateUserR;
	}

}