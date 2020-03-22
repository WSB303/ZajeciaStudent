package com.company.cos;

public class Car {
    final String mark;
    public final String model;
    final Integer yearOfProduction;
    final Double engineCapacity;
    final String colour;
    public Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.colour = colour;

        this.value = 20000.0;
    }
    public String toString(){
        return mark + "" + model + "" + yearOfProduction;
    }
}