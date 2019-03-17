package com.xyf.designPattern.factory.factoryMethod;

import com.xyf.designPattern.factory.HisenseTV;
import com.xyf.designPattern.factory.TV;

public class HisenseTVFactory implements TVFactory
{
    public TV produceTV()
    {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}
