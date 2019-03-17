package com.xyf.designPattern.single.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SeriableSingleton instance = new SeriableSingleton();
	
	private SeriableSingleton(){
		
	}
	
	public  static SeriableSingleton getInstance(){
		return instance;
	}
	
	//可防止通过序列化的方式，将单例变多例
	private  Object readResolve(){
        return  instance;
    }
}
