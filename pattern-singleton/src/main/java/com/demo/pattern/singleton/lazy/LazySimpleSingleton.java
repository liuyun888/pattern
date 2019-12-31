package com.demo.pattern.singleton.lazy;

/**
 * @Author lyk
 * @Date 2019/12/10 0010
 * @Description
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;//1

    public static LazySimpleSingleton getInstance() {//2
        if (lazy == null) {
            lazy = new LazySimpleSingleton();//3
        }
        return lazy;
    }

}
