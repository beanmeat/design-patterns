package com.meat.creatation.builder;

/**
 * @author tchstart
 * @data 2025-03-12
 */
public class XiaomiBuilder extends AbstractBuilder{

    public XiaomiBuilder() {
        this.phone = new Phone();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }
}
