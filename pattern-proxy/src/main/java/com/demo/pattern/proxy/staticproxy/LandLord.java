package com.demo.pattern.proxy.staticproxy;

/**
 * @program: pattern
 * @description: 真实对象（被代理对象） -- 房东
 * @author: LiuYunKai
 * @create: 2020-01-08 23:43
 **/
public class LandLord implements  Person{
    @Override
    public void rent() {
        System.out.println("欢迎来租房....");
    }
}
