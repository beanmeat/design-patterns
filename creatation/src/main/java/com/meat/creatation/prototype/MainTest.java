package com.meat.creatation.prototype;

/**
 * 原型模式：适用于创建重复对象，同时又能保证性能
 * MyBatis：操作数据库，从数据库里面查出很多记录（70%改变很少），每次查数据库，查到以后把所有的数据都封装成一个对象返回。
 *          10000 Thread：查一个记录：new User('a',18)：每次床i按一个对象封装并返回系统里面就会有10000个User
 *
 * 解决：缓存查过的记录，如果在查相同的记录，拿到原来的原型对象，不能是原对象。
 *
 * 深克隆/浅克隆
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        MyBatis mybatis = new MyBatis();

        User zs1 = mybatis.getUser("张三");
        zs1.setUsername("李四");
        System.out.println(zs1);
        User zs2 = mybatis.getUser("张三");
        System.out.println(zs2);
        User zs3 = mybatis.getUser("张三");
        System.out.println(zs3);
    }
}
