package com.xyf.designPattern.adapter.classAdapt;

public class Adapter extends Adaptee implements Target{
	@Override
	public void operation1(){
		super.operation1();
	}
	
	@Override
	public void operation2() {
		System.out.println("operation2...");
	}

}
