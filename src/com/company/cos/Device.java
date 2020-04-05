package com.company.cos;

import com.company.animal.Saleable;

public abstract class Device implements Saleable {
    public final String model;
    final public Integer yearOfProduction;
    final public String mark;
    public Double value;

    public Device(String model, Integer yearOfProduction, String mark) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.mark = mark;
    }
    public String toString(){
        return mark + "" + model + "" + yearOfProduction;
    }
    abstract void turnOn();

}
