package com.company;

import com.company.animal.Animal;
import com.company.animal.Human;
import com.company.cos.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("homosapiens");
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
        me.setCar(passat);
        System.out.println("I'm driving " + me.getCar().model);

        Human myWife = new Human("homosapiens");
        myWife.firstName = "Karolina";
        myWife.lastName = "Warda";
        myWife.setSalary(32000.0);
        myWife.setCar(passat);

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());



        me.pet.sell();
        me.car.sell();
    }
}
