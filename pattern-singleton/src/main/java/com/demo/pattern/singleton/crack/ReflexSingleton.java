package com.demo.pattern.singleton.crack;

/**
 * @Author lyk
 * @Date 2019/12/10 0010
 * @Description 通过反射破解单例，以饿汉式为例
 */
public class ReflexSingleton {

    private ReflexSingleton() {

        //防止反射破坏单例的解决方法
        if (instance != null) {
            try {
                throw new Exception("只能创建一个对象！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static final ReflexSingleton instance = new ReflexSingleton();

    public static ReflexSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(ReflexSingleton.getInstance());
        System.out.println(ReflexSingleton.getInstance());
        System.out.println("反射破解单例...");
        ReflexSingleton instance1 = ReflexSingleton.class.newInstance();
        ReflexSingleton instance2 = ReflexSingleton.class.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
