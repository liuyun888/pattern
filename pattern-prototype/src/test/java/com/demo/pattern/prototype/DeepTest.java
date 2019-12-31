package com.demo.pattern.prototype;

import com.demo.pattern.prototype.deep.SpiralShuriken;

/**
 * @program: pattern
 * @description: 深克隆测试
 * @author: LiuYunKai
 * @create: 2019-12-31
 **/
public class DeepTest {

    public static void main(String[] args) {

        SpiralShuriken spiralShuriken = new SpiralShuriken();

        SpiralShuriken clone = (SpiralShuriken) spiralShuriken.clone();


        System.out.println("复制对象:"+ clone);
        System.out.println("复制对象name:"+ clone.name);
        System.out.println("复制对象height:"+ clone.height);
        System.out.println("复制对象birthday:"+ clone.birthday);

        System.out.println("复制对象 螺旋手里剑的伤害值:"+ clone.spiralPill.superSpiralPillHurt());

        System.out.println("影分身和本体是否同一个：" + (spiralShuriken.spiralPill == clone.spiralPill));

    }
}
