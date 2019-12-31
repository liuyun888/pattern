package com.demo.pattern.factory.simplefactory;

import java.io.IOException;
import java.util.Properties;

import com.demo.pattern.factory.ICourse;

/**
 * @program: pattern
 * @description: 课程的工厂类
 * @author: LiuYunKai
 * @create: 2019-12-19 23:38
 **/
public class CourseFactory {

//    public static ICourse learn(String name) {
//
//        if ("java".equalsIgnoreCase(name)){
//            return new JavaCourse();
//        }else if ("python".equalsIgnoreCase(name)){
//            return new PythonCourse();
//        }else {
//            return null;
//        }
//
//    }

    /**
     * @Description: 利用反射技术优化简单工厂
     * @Param: 
     * @return: 
     * @Author: LiuYunKai
     * @Date: 2019/12/20 0020  0:25
     */
    public static ICourse learnByReflect() throws IOException, ClassNotFoundException,
            IllegalAccessException, InstantiationException {

        Properties props = new Properties();

        props.load(CourseFactory.class.getClassLoader().getResourceAsStream("config.properties"));

        Class<?> clazz = Class.forName((String) props.get("course"));

        return (ICourse) clazz.newInstance();
    }



}
