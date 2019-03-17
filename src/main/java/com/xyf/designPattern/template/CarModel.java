package com.xyf.designPattern.template;

public abstract class CarModel {
	
	abstract protected void start();
	
	abstract protected void stop();
	
	//模板方法，不允许覆盖重写
	final protected void execeed(){
		start();
		System.out.println("running ...");
		stop();
	}

}
