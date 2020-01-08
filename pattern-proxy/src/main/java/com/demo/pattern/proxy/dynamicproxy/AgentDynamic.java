package com.demo.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: pattern
 * @description: 中介（现在是个中介公司，可以代理很多房源）
 * @author: LiuYunKai
 * @create: 2020-01-09 00:21
 **/
public class AgentDynamic implements InvocationHandler {

    /**
     * 被代理的对象，把引用保存下来
     */
    private Object target;

    public Object getInstance(Object target) throws Exception {
        this.target = target;

        Class < ? > clazz = target.getClass();

        // JDK动态代理的实现关键在于java.lang.reflect.Proxy类，
        // 其newProxyInstance(ClassLoader loader,Class<?>[] interfaces, InvocationHandler h)方法是整个JDK动态代理的核心，用于生成指定接口的代理对象。
        // 这个方法有三个参数，分别表示加载动态生成的代理类的类加载器ClassLoader，代理类需要实现的接口interfaces以及调用处理器InvocationHandler
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        Object obj = method.invoke(this.target,args);

        after();

        return obj;
    }

    private void before() {
        System.out.println("我是中介，已了解你的需求，现在开始给你找房子");
    }

    private void after(){
        System.out.println("房子满意的话，咱们签合同吧");
    }
}
