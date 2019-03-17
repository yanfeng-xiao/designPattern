package com.xyf.designPattern.adapter.classAdapt;

public class Test {
	
	public static void main(String[] args){
		Target target = new Adapter();
		target.operation1();
		target.operation2();
	}
}
