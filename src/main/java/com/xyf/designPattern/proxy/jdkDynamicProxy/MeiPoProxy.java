package com.xyf.designPattern.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MeiPoProxy implements InvocationHandler{
	
	private Object subject;

    public MeiPoProxy(Object subject) {
        this.subject = subject;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(subject, args);
	}

    

}
