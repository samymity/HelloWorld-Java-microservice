package com.example.helloworld.test;

import java.util.Arrays;

public class MergeSortedArray {
	
	public int[] getFirstarray() {
		return firstarray;
	}



	public void setFirstarray(int[] firstarray) {
		this.firstarray = firstarray;
	}



	public int[] getSecondarray() {
		return secondarray;
	}



	public void setSecondarray(int[] secondarray) {
		this.secondarray = secondarray;
	}



	public int[] getThirdarray() {
		return thirdarray;
	}



	public void setThirdarray(int[] thirdarray) {
		this.thirdarray = thirdarray;
	}



	private int[] firstarray ;
	private int[] secondarray ;
	private int[] thirdarray ;
	
	
	public MergeSortedArray()
	{
		
		firstarray = new int[] {4,9,2};
		secondarray = new int[] {2 ,3 ,4};
		thirdarray = new int[] {};
		
		
	}
	
	
	
        public  void sort(  int[] a) {
	// TODO Auto-generated method stub
        	
        	
        	 Arrays.sort(a); 	
        System.out.println(Arrays.toString(a));
       
        
      
        	

}
	
	
}
