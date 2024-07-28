package com.sabanciuniv.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document("Users")
public class User {
	@Id
	private String Id;
	private String name;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User( String name) {
		super();
		this.name = name;
	}
	
	private User () {}
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + "]";
	}
	
	
}