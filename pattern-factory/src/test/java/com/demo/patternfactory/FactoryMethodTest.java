package com.demo.patternfactory;

import com.demo.patternfactory.factorymethod.ICourseFactory;
import com.demo.patternfactory.factorymethod.LearnJavaCourse;
import com.demo.patternfactory.factorymethod.LearnPathonCourse;

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
