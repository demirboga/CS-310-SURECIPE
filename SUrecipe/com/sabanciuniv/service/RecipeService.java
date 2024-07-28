package com.sabanciuniv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabanciuniv.model.Comment;
import com.sabanciuniv.model.Recipe;
import com.sabanciuniv.model.User;
import com.sabanciuniv.repo.CommentRepo;
import com.sabanciuniv.repo.RecipeRepo;
import com.sabanciuniv.repo.UserRepo;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/RecipeDB")
public class RecipeService {
	@Autowired private RecipeRepo recipeRepo;
	@Autowired private UserRepo userRepo;
	@Autowired private CommentRepo commentRepo;
	
	@GetMapping("/recipes")
	public List<Recipe> recipes(){
		
		return recipeRepo.findAll();
	}
	
	@GetMapping("/comments")
	public List<Comment> comments(){
		
		return commentRepo.findAll();
	}
	
	@GetMapping("/users")
public List<User> users(){
		
		return userRepo.findAll();
	}
	@PostMapping("/recipes/save")
	public Recipe saveRecipe(@RequestBody Recipe recipe) {
		Recipe recipeSaved =recipeRepo.save(recipe);
		return recipeSaved;
	}
	
	@PostMapping("/comments/save")
	public Comment saveComment(@RequestBody Comment comment) {
		Comment commentSaved =commentRepo.save(comment);
		return commentSaved;
	}
	
	@PostMapping("/users/save")
	public User saveUser(@RequestBody User user) {
		User userSaved =userRepo.save(user);
		return userSaved;
	}
	
	@PostMapping("/users/name")
	public List<User> userbyname(@RequestBody User user){
		return userRepo.findByName(user.getName());
	}
	@PostMapping("/recipes/type")
	public List<Recipe> recipesbytype(@RequestBody Recipe recipe){
		return recipeRepo.findByType(recipe.getType());
	}
	@PostMapping("/recipes/name")
	public List<Recipe> recipesbyname(@RequestBody Recipe recipe){
		return recipeRepo.findByName(recipe.getName());
	}
	
	
}
