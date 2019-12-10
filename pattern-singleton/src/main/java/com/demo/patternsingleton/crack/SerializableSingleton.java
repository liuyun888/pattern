package com.demo.patternsingleton.crack;

import java.io.*;

/**
 * @Author lyk
 * @Date 2019/12/10 0010
 * @Description 反序列化时导致单例破坏,前提是单例类实现了Serializable接口
 */
public class SerializableSingleton implements Serializable {

    private SerializableSingleton(){}

    private static final SerializableSingleton instance = new SerializableSingleton();

    public static SerializableSingleton getInstance() {
        return instance;
    }

    /**防止反序列化破坏单例的解决方法*/
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(SerializableSingleton.getInstance());
        System.out.println(SerializableSingleton.getInstance());
        System.out.println("反序列化破解单例...");
        SerializableSingleton instance1 = SerializableSingleton.getInstance();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        //序列化
        out.writeObject(instance1);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        //反序列化
        SerializableSingleton instance2 = (SerializableSingleton) ois.readObject();
        System.out.println(instance1);
        System.out.println(instance2);

    }
}
