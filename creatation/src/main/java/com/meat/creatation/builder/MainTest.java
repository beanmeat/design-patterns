package com.meat.creatation.builder;

/**
 * @author tchstart
 * @data 2025-03-12
 */
public class MainTest {
    public static void main(String[] args) {
        XiaomiBuilder builder = new XiaomiBuilder();

//        builder.customCam("16G");
//        builder.customDisk("1T");
//        builder.customCam("1亿");
//        builder.customCpu("晓龙888");
//        Phone phone = builder.getPhone();
//        System.out.println(phone);

        Phone phone = builder.customCam("16G")
                .customDisk("1T")
                .customCam("1亿")
                .customCpu("晓龙888").getPhone();
        System.out.println(phone);

    }
}
