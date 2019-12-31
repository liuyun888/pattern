package com.demo.pattern.factory.factorymethod;

import com.demo.pattern.factory.ICourse;
import com.demo.pattern.factory.JavaCourse;

/**
 * @program: pattern
 * @description: 学习java，工厂方法
 * @author: LiuYunKai
 * @create: 2019-12-30 14:32
 **/
public class LearnJavaCourse implements ICourseFactory{

    @Override
    public ICourse learnByFactoryMethod() {
        return new JavaCourse();
    }
}
