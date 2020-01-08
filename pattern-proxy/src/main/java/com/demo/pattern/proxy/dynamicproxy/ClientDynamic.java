package com.demo.pattern.proxy.dynamicproxy;

/**
 * @program: pattern
 * @description: 动态代理测试
 * @author: LiuYunKai
 * @create: 2020-01-09 00:31
 **/
public class ClientDynamic {

    public static void main(String[] args) {

        try {
            PersonDynamic obj = (PersonDynamic) new AgentDynamic().getInstance(new LandLordDynamicA());

            obj.rentDynamic();

            obj = (PersonDynamic) new AgentDynamic().getInstance(new LandLordDynamicB());

            obj.rentDynamic();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
