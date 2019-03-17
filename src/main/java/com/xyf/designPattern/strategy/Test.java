package com.xyf.designPattern.strategy;

public class Test {

	public static void main(String[] args) {
		PriceContext context = new PriceContext(new AdvancedMemberStrategy());
		System.out.println(context.quote(10));
		
		PriceContext context2 = new PriceContext(new PrimaryMemberStrategy());
		System.out.println(context2.quote(10));
	}

}
