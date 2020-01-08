package com.demo.pattern.proxy.dynamicproxy;

/**
 * @program: pattern
 * @description: 真实对象（被代理对象） -- 房东
 * @author: LiuYunKai
 * @create: 2020-01-08 23:43
 **/
public class LandLordDynamicB implements  PersonDynamic{
    @Override
    public void rentDynamic() {
        System.out.println("我是B房的房东，欢迎来租房....");
    }
}
