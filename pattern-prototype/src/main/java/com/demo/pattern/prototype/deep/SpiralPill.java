package com.demo.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @program: pattern
 * @description: 螺旋丸,  注意要支持 Serializable
 * @author: LiuYunKai
 * @create: 2019-12-31
 **/
public class SpiralPill implements Serializable {
    //螺旋丸默认伤害值
    public int hurt = 9999;

    public int defence = 9999;

    //螺旋手里剑伤害值
    public int superSpiralPillHurt(){

        return this.hurt *= 9000;

    }

}
