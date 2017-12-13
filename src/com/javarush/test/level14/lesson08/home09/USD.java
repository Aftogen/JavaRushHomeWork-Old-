package com.javarush.test.level14.lesson08.home09;


public class USD extends Money{

    public USD(double amount) {
        super (amount);
    }

    public double getAmount() {
        return super.getAmount();
    }

    public String getCurrencyName(){
        return "USD";
    }
}
