package com.xyf.designPattern.proxy.staticProxy;


public class SonXiangQin implements XiangQin {

	@Override
	public void visit() {
		System.out.println("RealSubject visit...");
	}

}
