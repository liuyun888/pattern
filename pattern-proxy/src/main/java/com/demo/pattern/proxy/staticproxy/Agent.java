package com.demo.pattern.proxy.staticproxy;

/**
 * @program: pattern
 * @description: 代理对象 -- 中介
 * @author: LiuYunKai
 * @create: 2020-01-08 23:45
 **/
public class Agent implements Person {
    /**
     *  会持有一个真实角色的引用，
     *  又是为什么呢？因为他并不会（或者是不能）真正处理业务逻辑（因为房子不是他的），
     *  他会将真正的逻辑委托给真实角色处理。
     *  但是这个代理角色也不是一无是处，除了房子不是他的，但是他还可以给你干点跑腿的工作嘛,
     *  比如租房前帮你按需求挑选房子等等（前置处理），等你租房后马桶堵了帮你处理等等（后置处理）.
     */
    LandLord landLord;

    public Agent(LandLord landLord) {
        this.landLord = landLord;
    }

    @Override
    public void rent() {

        //前置处理
        System.out.println("这套房子满足你的要求....");

        this.landLord.rent();

        //后置处理
        System.out.println("马桶堵了，我们帮你处理.....");

    }
}
