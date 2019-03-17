package com.xyf.designPattern.single.thread;

/**
 * 可实现每个线程只有一个ThreadSingleton的实例
 * @author Administrator
 *
 */
public class ThreadSingleton {
	
	private static final ThreadLocal<ThreadSingleton> instance =
            new ThreadLocal<ThreadSingleton>(){
                @Override
                protected ThreadSingleton initialValue() {
                    return new ThreadSingleton();
                }
            };

    private ThreadSingleton(){}

    public static ThreadSingleton getInstance(){
        return instance.get();
    }
    
}
