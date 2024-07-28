package com.sabanciuniv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabanciuniv.model.Comment;
import com.sabanciuniv.model.Recipe;
import com.sabanciuniv.model.User;
import com.sabanciuniv.repo.CommentRepo;
import com.sabanciuniv.repo.RecipeRepo;
import com.sabanciuniv.repo.UserRepo;

@RestController
@RequestMapping("/RecipeDB")
public class RecipeService {
	@Autowired private RecipeRepo recipeRepo;
	@Autowired private UserRepo userRepo;
	@Autowired private CommentRepo commentRepo;
	
	@GetMapping("/Recipes")
	public List<Recipe> recipes(){
		return recipeRepo.findAll();
	}
	
	@GetMapping("/Comments")
	public List<Comment> comments(){
		
		return commentRepo.findAll();
	}
	
	

	
}
