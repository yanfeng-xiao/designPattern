package com.xyf.designPattern.factory.abstractFactory;

import com.xyf.designPattern.factory.TV;

public interface TVFactory {
	
	public TV produceTV();
	
	public TVBox productTVBox();

}
