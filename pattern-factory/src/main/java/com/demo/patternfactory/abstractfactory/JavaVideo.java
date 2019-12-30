package com.demo.patternfactory.abstractfactory;

/**
 * @program: pattern
 * @description: 学习Java视频
 * @author: LiuYunKai
 * @create: 2019-12-30 16:33
 **/
public class JavaVideo implements IVideo{
    @Override
    public void LearnVideo() {
        System.out.println("学习JAVA视频");
    }

}
