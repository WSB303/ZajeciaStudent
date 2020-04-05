package com.company.cos;

import com.company.animal.Human;
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
    public void sell(Human buyer, Human seller, double price) throws Exception {
        if (buyer.cash >= price){
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            System.out.println(seller.firstName+ " " + " sprzedał" + buyer.firstName +" "+ this.model + " za kwote "+ price);
        }else {
            System.out.println("Nie masz wystarczająco gotówki.");
        }
    }
}