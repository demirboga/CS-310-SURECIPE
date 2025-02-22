package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.User;

@Repository
public interface UserRepo extends MongoRepository<User,String> {

	public List<User> findAll();
	public List<User> findByName(String name);

}
