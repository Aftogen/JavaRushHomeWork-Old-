package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Prudnikov.A on 15.08.2016.
 */
public abstract class Hen implements Country{
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я курица.";
    }
}
