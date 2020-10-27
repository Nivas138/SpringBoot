package com.store.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping("/users")
	public ResponseEntity createUser(@RequestBody User user) {
		User saveduser = daoservice.Save(user);
		
		//Http response 201
		//Get /user/id and location of created user
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveduser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/users/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		int userid = Integer.parseInt(id);
		User deletedUser = daoservice.deleteUser(userid);
	}
}
