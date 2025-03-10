package com.meat.creatation.singleton;

/**
 * 单例资源
 */
public class Person {

    private  String name;

    private String age;

    // 懒汉、硬汉
    private volatile static Person instance;

    // 构造器私有化，外部不能实例化
    private Person() {
        System.out.println("创建Person");
    }

    // 提供给外类的方法
    // 1.public synchronized static Person getPerson() 能解决但锁粒度太大
    // 2.双重检查锁 + 内存可见性
    public static Person getPerson() {
        // 如果没有实例再去创建
        if(instance == null) {
            synchronized (Person.class){
                if(instance == null){
                    instance = new Person();
                }
            }
        }
        return instance;
    }
}
