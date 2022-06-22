package com.springcore;


import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{
    @Override
    public void call() {
        System.out.println("Calling from Airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing from Airtel");
    }
}
