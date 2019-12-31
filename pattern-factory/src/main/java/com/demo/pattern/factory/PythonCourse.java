package com.demo.pattern.factory;

/**
 * @program: pattern
 * @description: Python课程
 * @author: LiuYunKai
 * @create: 2019-12-19 23:35
 **/
public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("学习录制的Python课程");
    }
}
