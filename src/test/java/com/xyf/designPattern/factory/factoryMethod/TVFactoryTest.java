package com.xyf.designPattern.factory.factoryMethod;

public class TVFactoryTest {
	
	public static void main(String[] args){
		TVFactory factory = new HaierTVFactory();
		factory.produceTV().play();
	}

}
