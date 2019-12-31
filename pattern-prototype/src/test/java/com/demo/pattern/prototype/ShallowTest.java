package com.demo.pattern.prototype;


import com.demo.pattern.prototype.shallow.Client;
import com.demo.pattern.prototype.shallow.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: pattern
 * @description: 浅克隆测试
 * @author: LiuYunKai
 * @create: 2019-12-31 14:07
 **/
public class ShallowTest {

    public static void main(String[] args) {
        //先创建需要被克隆的对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();

        concretePrototype.setItemName("检测项目名");
        concretePrototype.setUserName("检测人员");
        concretePrototype.setAgentId(24125);
        List sampleList = new ArrayList<String>(8);
        concretePrototype.setSamples(sampleList);

        //开始克隆
        Client client = new Client(concretePrototype);

        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);


        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getSamples());
        System.out.println("原对象中的引用类型地址值：" + concretePrototype.getSamples());
        System.out.println("对象地址比较："+(concretePrototypeClone.getSamples() == concretePrototype.getSamples()));
    }

}
