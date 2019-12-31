package com.demo.pattern.prototype.shallow;

/**
 * @program: pattern
 * @description: 客户类
 * @author: LiuYunKai
 * @create: 2019-12-31 11:01
 **/
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
