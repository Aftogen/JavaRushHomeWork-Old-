package com.javarush.test.level14.lesson06.home01;


public class BelarusianHen extends Hen {
    String country = Country.BELARUS;
    static int eggsPerMonth = 25;
    public int getCountOfEggsPerMonth(){
        return eggsPerMonth;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + country +". Я несу " + eggsPerMonth +" яиц в месяц.";
    }
    BelarusianHen(String s){
        this.country = s;
    }
}
