package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfiguration.class);
        Sim sim=context.getBean(Airtel.class);
        sim.call();


    }
}
