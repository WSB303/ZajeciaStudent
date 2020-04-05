package com.company.cos;

public class Device {
    public final String model;
    final public Integer yearOfProduction;
    final public String mark;
    public Double value;

    public Device(String model, String yearOfProduction, Integer mark) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.mark = mark;
    }
    public String toString(){
        return mark + "" + model + "" + yearOfProduction;
    }
}
