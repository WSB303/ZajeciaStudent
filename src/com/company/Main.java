package com.company;

import com.company.cos.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        System.out.println(me.pet.name);

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.setSalary(2000.0);
        Car passat = new Car("Volkswagen", "Passat", 1984, 1.9, "Red");
        Car Ford = new Car("cos","jakos",1995,3.0,"red");
        me.setCar(passat);
        System.out.println("I'm driving " + me.getCar().model);

        Human myWife = new Human();
        myWife.firstName = "Karolina";
        myWife.lastName = "Warda";
        myWife.setSalary(32000.0);
        myWife.setCar(Ford);

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());
    }
}
