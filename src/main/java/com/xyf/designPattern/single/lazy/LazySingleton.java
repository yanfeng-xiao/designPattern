package com.xyf.designPattern.single.lazy;

public class LazySingleton {
	
	private static volatile  LazySingleton instance = null;
	
	private LazySingleton(){
		
	}

	public static LazySingleton getInstance(){
		if(null == instance){
			synchronized(LazySingleton.class){
				if(null == instance){
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
	public static synchronized LazySingleton getInstance2(){
		if(null == instance){
			instance = new LazySingleton();
		}
		return instance;
	}
}
