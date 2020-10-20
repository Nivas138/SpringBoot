package com.store.users;

public class User {

	private String name;
	
	private Integer id;
	
	private String Designation;

	public User(String name, Integer id, String designation) {
		super();
		this.name = name;
		this.id = id;
		Designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", Designation=" + Designation + "]";
	}
	
	
}
