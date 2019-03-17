package com.xyf.designPattern.adapter.instanceAdapt;

public class Test {
	
	public static void main(String[] args){
		Target target = new Adapter(new Adaptee());
		target.operation1();
		target.operation2();
	}
}
