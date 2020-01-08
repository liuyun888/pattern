package com.demo.pattern.proxy.staticproxy;

/**
 * @program: pattern
 * @description: 测试
 * @author: LiuYunKai
 * @create: 2020-01-08 23:53
 **/
public class Client {
    public static void main(String[] args) {
        //只能帮这个房东找租客，不能帮别的房东
        Agent agent = new Agent(new LandLord());

        agent.rent();
    }
}
