package com.company.animal;

import java.io.File;

public class Animal implements Edible, Saleable {
    final public String species;
    protected Double weight;
    public String name;
    public File pic;

    public static final Double DEAFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEAFAULT_MOUSE_WEIGHT = 0.01;
    public static final Double DEAFAULT_LION_WEIGHT = 123.0;
    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEAFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEAFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEAFAULT_LION_WEIGHT;
                break;
        }

    }

    public void feed() {
        if(weight>0.0) {
            weight++;
            System.out.println("thx for food bro, " + weight + "kg");
        }
        else{
            System.out.println("Man! Your dog is dead you cannot feed him");
        }
    }
    void takeForAWalk() {
        weight--;
        if(weight>0.0) {
            System.out.println("thx for taking me for walk, " + weight + "kg");
        }
        else {
            System.out.println("Man! Your dog is dead you cannot take him for a walk");
            System.out.println("Your dog is dead");
        }

    }
    boolean imDead() {
        if(weight<=0.0) {
            System.out.println("Your dog is dead");
            return false;
        }
        else{
            return true;
        }

    }
    public String toString(){
        return species + "" + name;
    }

    @Override
    public void beEaten() throws Exception {
        System.out.println("Adiooooooos");
        this.weight= 0.0;
        if(this instanceof Human){
            throw new Exception("No way you cannibal!");
        } else {
            System.out.println("Adiooos");
            this.weight = 0.0;
        }
    }


    @Override
    public void sell(Human buyer, Human seller, double price) throws Exception {
        if (buyer.cash >= price){
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            System.out.println(seller.firstName+ " " + " sprzedał " + buyer.firstName +" "+ this.name + " za kwote "+ price);
        }else {
            System.out.println("Nie masz wystarczająco gotówki.");
        }
    }
}

