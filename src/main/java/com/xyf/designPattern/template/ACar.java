package com.xyf.designPattern.template;

public class ACar extends CarModel{

	@Override
	protected void start() {
		System.out.println(" ACar start...");
	}

	@Override
	protected void stop() {
		System.out.println(" ACar stop...");
	}

}
