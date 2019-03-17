package com.xyf.designPattern.strategy;

public class PriceContext {
	
	private MemberStrategy memberStrategy;
	
	public PriceContext(MemberStrategy memberStrategy){
		this.memberStrategy = memberStrategy;
	}
	
	public double quote(double price){
		return memberStrategy.calPrice(price);
	}

}
