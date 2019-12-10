package com.demo.patternsingleton.hungry;

/**
 * @Author lyk
 * @Date 2019/12/10 0010
 * @Description
 */
public class HungrySingleton {
    //先静态后动态、先属性后方法

    /**此处该类的构造器用private修饰，防止外部手动通过new创建。后面的例子都需要这样，后面就不解释了*/
    private HungrySingleton(){}

    /**此处是核心，instance使用static修饰，然后调用new创建对象，
     * 我们知道static修饰的东西都属于类，而且在类加载阶段就已经被加载，
     * 并且只能被加载一次。就是类加载这种特性很好的保证了单例的特性，
     * 也天然防止了并发的问题
     */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    /**当外部调用HungrySingleton.getInstance()时，就会返回唯一的instance实例。*/
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
