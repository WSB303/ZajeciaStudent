package com.company.cos;

import com.company.animal.Saleable;

public class Phone extends Device implements Saleable {

    public Phone(String model, Integer yearOfProduction, String mark) {
        super(model, yearOfProduction, mark);
    }
    @Override
    void turnOn(){
        System.out.println("Hello kity");
    }

    @Override
    public void sell() throws Exception {
        System.out.println("Phone sold");
    }
}
