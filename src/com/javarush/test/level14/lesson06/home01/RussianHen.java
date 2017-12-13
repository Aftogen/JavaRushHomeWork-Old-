package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Prudnikov.A on 15.08.2016.
 */

public class RussianHen extends Hen {
    String country = Country.RUSSIA;
    static int eggsPerMonth = 10;
    public int getCountOfEggsPerMonth(){
        return eggsPerMonth;
    }
    String getDescription(){

        return super.getDescription() + " Моя страна - " + country +". Я несу " + eggsPerMonth +" яиц в месяц.";
    }
    RussianHen(String s){
        this.country = s;
    }
}
