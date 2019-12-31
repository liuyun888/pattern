package com.demo.pattern.factory;
/**
 * @program: pattern
 *
 * @description: JAVA课程
 *
 * @author: LiuYunKai
 *
 * @create: 2019-12-19 23:25
 **/
public class JavaCourse implements ICourse{


    @Override
    public void record() {
        System.out.println("学习录制的Java课程");
    }


}
