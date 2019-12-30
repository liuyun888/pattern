package com.demo.patternfactory.factorymethod;

import com.demo.patternfactory.ICourse;
import com.demo.patternfactory.PythonCourse;

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
