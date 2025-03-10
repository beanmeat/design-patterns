package com.meat.creatation.prototype;

public class User implements Cloneable{
    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public User() {
        System.out.println("User对象创建...");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 再创建一个对象，赋予属性
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUsername(this.username);
        user.setAge(this.age);
        return user;
    }
}
