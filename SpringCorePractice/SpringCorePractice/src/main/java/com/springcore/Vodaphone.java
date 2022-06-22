package com.springcore;


import org.springframework.stereotype.Component;

@Component
public class Vodaphone implements Sim{

    @Override
    public void call() {
        System.out.println("Calling from Vodaphone");
    }

    @Override
    public void data() {
        System.out.println("Browsing from Vodaphone");
    }
}
