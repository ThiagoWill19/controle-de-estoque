package com.will.models;

import java.util.UUID;

import com.will.models.enums.Privileges;

public class Operator {

	private UUID id;
	private String name;
	private Privileges privilege;
	
	public Operator(String name, Privileges privilege) {
		this.name = name;
		this.privilege = privilege;
	}
	
	public Operator() {
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Privileges getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privileges privilege) {
		this.privilege = privilege;
	}
	
	
}
