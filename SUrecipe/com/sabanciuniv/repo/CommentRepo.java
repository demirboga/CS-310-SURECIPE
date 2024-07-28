package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.Comment;
import com.sabanciuniv.model.Recipe;


@Repository
public interface CommentRepo extends MongoRepository<Comment,String>{	
	public List<Comment> findByRecipeName(String recipename);
	
}