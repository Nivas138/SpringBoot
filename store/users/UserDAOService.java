package com.store.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component

public class UserDAOService {

	private static List<User> userlist = new ArrayList<>();
	
	private static int userlistcount = 0;
	
	static {
		userlist.add(new User("Nivas", 1,"Builder"));
		userlist.add(new User("Nivas Ganesan" , 2 , "Thinker"));
	}
	
	//function for find all
	public List<User> findAll(){
		return userlist;
	}
	
	//function for put 
	public User Save(User user) {
		if(user.getId() == null) {
			user.setId(++userlistcount);
		}
		userlist.add(user);
		return null;
	}
	
	//function for retrive 
	public User findSingle(int id) {
		for (User user : userlist) {
			if(id == user.getId()) {
				return user;
			}
		}
		return null;
	}
}
