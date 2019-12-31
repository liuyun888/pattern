package com.demo.pattern.factory;

import com.demo.pattern.factory.factorymethod.ICourseFactory;
import com.demo.pattern.factory.factorymethod.LearnJavaCourse;
import com.demo.pattern.factory.factorymethod.LearnPathonCourse;

/**
 * @program: pattern
 * @description: 工厂方法测试
 * @author: LiuYunKai
 * @create: 2019-12-30 14:37
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory courseFactory = new LearnJavaCourse();

        ICourse course = courseFactory.learnByFactoryMethod();

        course.record();


        courseFactory = new LearnPathonCourse();
        course = courseFactory.learnByFactoryMethod();

        course.record();
    }

}
