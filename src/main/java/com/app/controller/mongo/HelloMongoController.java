package com.app.controller.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.entity.mongo.common.Users;
import com.app.entity.mongo.common.Users2;
import com.app.service.mongo.UsersService;
import com.app.service.mongo.UsersService2;

@Controller
public class HelloMongoController {

	@Autowired
	UsersService db1Service;

	@Autowired
	UsersService2 db2Service;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody Users addUser(@RequestBody Users userR) {
		return db1Service.addUser(userR);
	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public @ResponseBody List<Users> getUsers() {
		return db1Service.getUsers();
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public @ResponseBody Users updateUser(@RequestBody Users updateUserR) {
		return db1Service.updateUser(updateUserR);
	}

	@RequestMapping(value = "/addUser2", method = RequestMethod.POST)
	public @ResponseBody Users2 addUser2(@RequestBody Users2 userR) {
		return db2Service.addUser2(userR);
	}

	@RequestMapping(value = "/getUsers2", method = RequestMethod.GET)
	public @ResponseBody List<Users2> getUsers2() {
		return db2Service.getUsers2();
	}

	@RequestMapping(value = "/updateUser2", method = RequestMethod.PUT)
	public @ResponseBody Users2 updateUser2(@RequestBody Users2 updateUserR) {

		return db2Service.updateUser2(updateUserR);
	}

}