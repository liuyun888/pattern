package com.demo.pattern.singleton.register;

/**
 * @Author liuyunkai
 * @Date 2019/12/10 0010
 * @Description
 */
public enum  EnumSingleton {
    /**枚举方式单例*/
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
