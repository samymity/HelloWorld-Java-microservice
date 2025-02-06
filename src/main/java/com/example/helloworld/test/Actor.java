package com.example.helloworld.test;

import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	String name;
	
	public Actor(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
