package com.meat.structural.facade;

public class WeiXinFacade {

    Police police = new Police();
    Edu edu = new Edu();
    Social social = new Social();

    public void handle(String name){
        police.register(name);
        edu.assignSchool(name);
        social.handleSocial(name);
    }
}
