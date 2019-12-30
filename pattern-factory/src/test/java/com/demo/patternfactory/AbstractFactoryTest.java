package com.demo.patternfactory;

import com.demo.patternfactory.abstractfactory.CourseAbstractFactory;
import com.demo.patternfactory.abstractfactory.LearnJavaCourse;
import com.demo.patternfactory.abstractfactory.LearnPythonCourse;

/**
 * @program: pattern
 * @description: 抽象工厂测试类
 * @author: LiuYunKai
 * @create: 2019-12-30 16:35
 **/
public class AbstractFactoryTest {


    public static void main(String[] args) {

        CourseAbstractFactory factory = new LearnJavaCourse();

        factory.LearnNote().LearnNote();

        factory.LearnVideo().LearnVideo();


        factory = new LearnPythonCourse();

        factory.LearnVideo().LearnVideo();

        factory.LearnNote().LearnNote();

    }

}
