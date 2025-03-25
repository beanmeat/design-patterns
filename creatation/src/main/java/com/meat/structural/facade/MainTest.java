package com.meat.structural.facade;

/**
 * 门面模式
 */
public class MainTest {
    public static void main(String[] args) {
//        Police police = new Police();
//        police.register("tchstart");
//
//        Edu edu = new Edu();
//        edu.assignSchool("tchstart");
//
//        Social social = new Social();
//        social.handleSocial("tchstart");
        WeiXinFacade facade = new WeiXinFacade();
        facade.handle("tchstart");

    }
}
