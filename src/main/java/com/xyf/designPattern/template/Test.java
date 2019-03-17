package com.xyf.designPattern.template;

public class Test {

	public static void main(String[] args) {
		CarModel carA = new ACar();
		carA.execeed();
		
		CarModel carB = new BCar();
		carB.execeed();
	}

}
