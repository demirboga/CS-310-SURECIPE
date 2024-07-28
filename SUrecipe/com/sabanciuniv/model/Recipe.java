package com.sabanciuniv.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Recipes")
public class Recipe {
	@Id
	private String Id;
	
	private String name;
	private ArrayList<String> ingredients;
	private ArrayList<String> instructions;
	private String type;
	private String calorie;
	@DBRef
	private Comment comment;
	private List<Comment> comments;
	@DBRef
	private User user;
	private String userid;
	
	
	
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public ArrayList<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(ArrayList<String> instructions) {
		this.instructions = instructions;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
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
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCalorie() {
		return calorie;
	}
	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Recipe(String name, ArrayList<String> ingredients,ArrayList<String> instructions, String type, String calorie, 
			List<Comment> comments, String userid) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.type = type;
		this.calorie = calorie;
		this.comments = comments;
		this.userid = userid;
		this.instructions=instructions;
	}
	
	public Recipe() {}
	@Override
	public String toString() {
		return "Recipe [Id=" + Id + ", name=" + name + ", ingredients=" + ingredients + ", type=" + type + ", calorie="
				+ calorie + ", rating=" + ", comment=" + comment + ", comments=" + comments + ", user=" + user
				+ "]";
	}
	
	
	
}
