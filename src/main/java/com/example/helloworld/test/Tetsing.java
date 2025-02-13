package com.example.helloworld.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tetsing {
	
	
	@Autowired
	Bucket bucket;

	
	
	
	public Bucket myfunction()
	{
		
		return  bucket;
	}


	public Bucket myfunction2()
	{
		
		return  bucket;
	}
	
	
}
