package com.demo.pattern.factory;

/**
 * @program: pattern
 * @description: 无工厂模式测试
 * @author: LiuYunKai
 * @create: 2019-12-19 23:48
 **/
public class NoFactoryTest {

    public static void main(String[] args) {

        ICourse course = new JavaCourse();

        course.record();

    }

}
