package com.demo.pattern.factory.abstractfactory;

/**
 * @program: pattern
 * @description: 学习python课程
 * @author: LiuYunKai
 * @create: 2019-12-30 16:45
 **/
public class LearnPythonCourse implements CourseAbstractFactory {


    @Override
    public INote LearnNote() {
        return new PythonNote();
    }

    @Override
    public IVideo LearnVideo() {
        return new PythonVideo();
    }
}
