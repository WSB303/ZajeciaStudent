package com.company.animal;

import com.company.cos.Car;
import com.company.cos.Phone;

public class Human extends Animal implements Saleable{
   public  String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car car;
    public Double salary;
    public Double cash = 2000.0;
    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human(String homosapiens) {
        super("homosapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        System.out.println("Your salary is now: " + salary);
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("you bought is by cash");
            this.car = car;
        } else if (this.salary >= car.value / 12) {
            System.out.println("you bought it on credit");
            this.car = car;
        } else {
            System.out.println("sorry, first ask for a rise");
        }
    }
    public String toString(){
        return firstName + "" + lastName;
    }



    @Override
    public void sell(Human buyer, Human seller, double price) throws Exception {
        System.out.printf("Nie można kupić ani sprzedać człowieka.");
    }
}