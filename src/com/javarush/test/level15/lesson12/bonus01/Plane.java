package com.javarush.test.level15.lesson12.bonus01;


public class Plane implements Flyable{
    public int amount;
    public void fly() {}

    public Plane(int amount) {
        this.amount = amount;
    }
}
