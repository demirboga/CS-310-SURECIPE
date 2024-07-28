package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.Recipe;


@Repository
public interface RecipeRepo extends MongoRepository<Recipe, String> {

	public List<Recipe>  findAll();
	
	public List<Recipe> findByName(String name);
	public List<Recipe> findByType(String type);

}

