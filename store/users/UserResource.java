package com.store.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDAOService daoservice;
	
	//Find All Users
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return daoservice.findAll();
	}
	
	//FindSingleUser
	@GetMapping("/users/{id}")	
	public User findOne(@PathVariable String id){
		int userid = Integer.parseInt(id);
		return daoservice.findSingle(userid);
	}
	
	
}