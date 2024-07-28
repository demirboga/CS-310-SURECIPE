package com.sabanciuniv.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document("Comments")
public class Comment {
	@Id private String Id;
	
	@DBRef
	private Recipe recipe;
	private String info;
	@DBRef
	private User user;
	private String userid;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id=Id;
	}
	public Comment(String info, String userid) {
		super();
		this.info = info;
		this.userid= userid;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Comment() {}
	@Override
	public String toString() {
		return "Comment [Id=" + Id  + ", recipe=" + recipe + ", info=" + info + ", user=" + user
				+ "]";
	}
	
	
}
