package com.xyf.designPattern.single.hungry;

public class HungrySingleton {
	
	private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

}
