package com.meat.creatation.singleton;

public class main {
    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person2 == person1);
    }
}
