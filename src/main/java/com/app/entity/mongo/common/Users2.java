package com.app.entity.mongo.common;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users2")
public class Users2 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String firstname;
	private String lastname;

	public Users2() {
	}

	public Users2(String firstName, String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	@Override
	public String toString() {
		return "Users2 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}