package com.demo.pattern.factory.abstractfactory;

/**
 * @program: pattern
 * @description: 学习python视频
 * @author: LiuYunKai
 * @create: 2019-12-30 16:43
 **/
public class PythonVideo implements IVideo{
    @Override
    public void LearnVideo() {
        System.out.println("学习python视频");
    }
}
