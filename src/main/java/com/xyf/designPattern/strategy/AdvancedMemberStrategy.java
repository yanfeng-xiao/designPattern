package com.xyf.designPattern.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calPrice(double booksPrice) {
        
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
