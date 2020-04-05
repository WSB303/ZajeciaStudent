package com.company.cos;

public class Car extends Device{

    final Double engineCapacity;
    final String colour;



    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        super(mark,model,yearOfProduction);
        this.engineCapacity = engineCapacity;
        this.colour = colour;

        this.value = 20000.0;
    }

}