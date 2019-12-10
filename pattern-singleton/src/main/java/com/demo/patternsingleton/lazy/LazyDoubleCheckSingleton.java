package com.demo.patternsingleton.lazy;

/**
 * @Author lyk
 * @Date 2019/12/10 0010
 * @Description
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    private static volatile LazyDoubleCheckSingleton lazy = null;//2

    public LazyDoubleCheckSingleton getInstance() {//1
        if(lazy == null){//3
            synchronized (LazyDoubleCheckSingleton.class) {//5
                if (lazy == null) {//4
                    lazy = new LazyDoubleCheckSingleton();//6
                }
            }
        }
        return lazy;
    }

}
