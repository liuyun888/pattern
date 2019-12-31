package com.demo.pattern.prototype.deep;

import java.io.ObjectInputStream;

import java.io.*;
import java.io.ByteArrayOutputStream;
import java.util.Date;

/**
 * @program: pattern
 * @description: 螺旋手里剑, 注意要支持 Cloneable,Serializable，否则会报空指针异常
 * @author: LiuYunKai
 * @create: 2019-12-31
 **/
public class SpiralShuriken extends Naruto implements Cloneable, Serializable {

    public SpiralPill spiralPill;

    public SpiralShuriken() {
        //初始化
        this.spiralPill = new SpiralPill();
    }

    @Override
    public Object clone() {
        return this.deepClone();
    }

    /**
     * 通过序列化进行深克隆
     *
     * @return Object
     */
    public Object deepClone() {
        try {
            //将对象放入流中
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            //将对象从流中读出
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            SpiralShuriken spiralShurikenCopy = (SpiralShuriken) ois.readObject();

            spiralShurikenCopy.birthday = new Date();
            spiralShurikenCopy.name = "鸣人分身";
            spiralShurikenCopy.height = 180;

            return spiralShurikenCopy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
