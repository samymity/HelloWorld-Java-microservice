package com.example.helloworld.test;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class Bucket {
	
	
	
	public Bucket() {
		super();
		this.list = new ArrayList();
	}

	
	
	
	
	ArrayList<String> list;

	public ArrayList<String> getlist() {
		return list;
	}

	public void setlist(ArrayList<String> list) {
		this.list = list;
	}

}
