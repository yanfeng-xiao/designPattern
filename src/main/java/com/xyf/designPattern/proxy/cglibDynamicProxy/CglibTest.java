package com.xyf.designPattern.proxy.cglibDynamicProxy;


public class CglibTest {
    public static void main(String[] args) {

        try {
            XiangQin obj = (XiangQin) new CGlibMeipo().getInstance(XiangQin.class);
            System.out.println(obj);
            obj.visit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
