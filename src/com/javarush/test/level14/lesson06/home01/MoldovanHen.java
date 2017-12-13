package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen {
    String country = Country.MOLDOVA;
    static int eggsPerMonth = 20;
    public int getCountOfEggsPerMonth(){
        return eggsPerMonth;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + country +". Я несу " + eggsPerMonth +" яиц в месяц.";
    }
    MoldovanHen(String s){
        this.country = s;
    }
}
