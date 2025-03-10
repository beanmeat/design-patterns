package com.meat.creatation.singleton;

import java.util.Map;
import java.util.Properties;

/**
 * 东西只能有一个
 */
public class MainTest {
    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person2 == person1);


        /**
         * 多线程中的线程池
         * 数据库中的连接池
         * 系统环境信息
         * 上下文（ServletContext）
         */
        Properties properties = System.getProperties();
        System.out.println(properties);

        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);
    }
}
