package com.example.helloworld.test;


import org.springframework.stereotype.Component;

@Component
public class ChildLego {
	
	String a ;
	
    public  ChildLego( String a)  {
		
		this.a =a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	

}
