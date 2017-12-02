package com.nezha.gcar.member.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","dubbo_provider.xml"});
        context.start();
        System.out.println("启动了-------------------");
        System.in.read();
    }
}
