package com.demo.patternfactory.abstractfactory;

/**
 * @program: pattern
 * @description: 学习java课程
 * @author: LiuYunKai
 * @create: 2019-12-30 16:36
 **/
public class LearnJavaCourse implements CourseAbstractFactory {
    @Override
    public INote LearnNote() {
        return new JavaNote();
    }

    @Override
    public IVideo LearnVideo() {
        return new JavaVideo();
    }
}
