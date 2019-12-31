package com.demo.pattern.factory.factorymethod;

import com.demo.pattern.factory.PythonCourse;
import com.demo.pattern.factory.ICourse;

/**
 * @program: pattern
 * @description: 学习python，工厂方法
 * @author: LiuYunKai
 * @create: 2019-12-30 14:35
 **/
public class LearnPathonCourse implements ICourseFactory {
    @Override
    public ICourse learnByFactoryMethod() {
        return new PythonCourse();
    }
}
