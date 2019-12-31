package com.demo.pattern.singleton.lazy;

/**
 * @Author lyk
 * @Date 2019/12/10 0010
 * @Description
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}

    private static class LazyHolder{ //1

        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //final 保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance() { //2
        return LazyHolder.LAZY;
    }
}
