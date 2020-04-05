package com.company.cos;

import com.company.animal.Saleable;

public class Car extends Device implements Saleable {

    final Double engineCapacity;
    final String colour;



    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        super(mark,yearOfProduction,model);
        this.engineCapacity = engineCapacity;
        this.colour = colour;

        this.value = 20000.0;
    }

    @Override
    void turnOn() {

    }

    @Override
    public void sell() throws Exception {
        System.out.println("Car sold");
    }
}