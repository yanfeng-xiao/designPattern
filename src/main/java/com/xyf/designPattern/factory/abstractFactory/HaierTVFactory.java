package com.xyf.designPattern.factory.abstractFactory;

import com.xyf.designPattern.factory.HairTV;
import com.xyf.designPattern.factory.TV;

public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HairTV();
    }
    
    public TVBox productTVBox(){
    	System.out.println("海尔电视机工厂生产海尔电视机的机箱。");
        return new HairTVBox();
    }
}
