package com.demo.pattern.factory;

import com.demo.pattern.factory.simplefactory.CourseFactory;

import java.io.IOException;

/**
 * @program: pattern
 * @description: 简单工厂测试类
 * @author: LiuYunKai
 * @create: 2019-12-19 23:39
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //1.简单工厂
//        ICourse course = CourseAbstractFactory.learn("java");
//
//        course.record();

        //2.反射优化
        ICourse course = CourseFactory.learnByReflect();

        course.record();



    }

}
