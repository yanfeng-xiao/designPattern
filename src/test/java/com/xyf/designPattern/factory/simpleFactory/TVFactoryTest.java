package com.xyf.designPattern.factory.simpleFactory;

public class TVFactoryTest {
	
	public static void main(String[] args){
		TVFactory.create(TVType.HISENSE).play();
	}

}
