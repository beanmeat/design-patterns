package com.meat.creatation.builder;

/**
 * @author tchstart
 * @data 2025-03-12
 * 抽象建造者
 */
public abstract class AbstractBuilder {

    public Phone phone;

    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);

    public Phone getPhone(){
        return phone;
    }
}
