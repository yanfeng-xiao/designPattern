package com.xyf.designPattern.proxy.jdkDynamicProxy;


public class SonXiangQin implements XiangQin {

	@Override
	public void visit() {
		System.out.println("RealSubject visit...");
	}

}
