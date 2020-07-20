package com.ss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        AppService appService = ctx.getBean(AppService.class);
        System.out.println(appService.multiply(6, 8));
    }
}
