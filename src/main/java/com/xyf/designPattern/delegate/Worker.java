package com.xyf.designPattern.delegate;

public class Worker implements Workable {
	
	private String name;
	
	public Worker(String name){
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void work() {
		System.out.println(name + " begin working...");
		System.out.println(name + " work over...");
	}

}
