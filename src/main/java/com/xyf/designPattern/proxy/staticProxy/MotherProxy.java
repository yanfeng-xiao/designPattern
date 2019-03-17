package com.xyf.designPattern.proxy.staticProxy;

public class MotherProxy implements XiangQin{
	
	private XiangQin subject;

    public MotherProxy(XiangQin subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }

}
