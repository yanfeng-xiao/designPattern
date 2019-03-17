package com.xyf.designPattern.factory.abstractFactory;

import com.xyf.designPattern.factory.TV;

public class AbstractTVFactoryTest {
	
	public static void main(String[] args) {
		TV tv = null;
		TVBox box = null;
		TVFactory factory = new HisenseTVFactory();
		tv = factory.produceTV();
		tv.play();
		box = factory.productTVBox();
		box.boxSize();
	}

}
