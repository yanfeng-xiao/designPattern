package com.xyf.designPattern.adapter.instanceAdapt;

public class Adapter implements Target{
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public void operation2() {
		System.out.println("operation2...");
	}

	@Override
	public void operation1() {
		adaptee.operation1();
		
	}

}
