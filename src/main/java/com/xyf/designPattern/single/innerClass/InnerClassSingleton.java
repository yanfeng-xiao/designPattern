package com.xyf.designPattern.single.innerClass;

public class InnerClassSingleton {
	
	private InnerClassSingleton(){
    }
	
	public static InnerClassSingleton getInstance(){
		return LazyHolder.LAZY;
	}

	private static class LazyHolder{
        private static final InnerClassSingleton LAZY = new InnerClassSingleton();
    }
}
