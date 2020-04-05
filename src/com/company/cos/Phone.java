package com.company.cos;

import com.company.animal.Human;
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
