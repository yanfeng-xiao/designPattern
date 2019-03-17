package com.xyf.designPattern.template;

public class BCar extends CarModel{

	@Override
	protected void start() {
		System.out.println(" BCar start...");
	}

	@Override
	protected void stop() {
		System.out.println(" BCar stop...");
	}

}
