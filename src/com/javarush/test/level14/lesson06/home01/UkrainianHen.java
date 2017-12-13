package com.javarush.test.level14.lesson06.home01;


public  class UkrainianHen extends Hen {
    String country = Country.UKRAINE;
    static int eggsPerMonth = 15;
    public int getCountOfEggsPerMonth(){
        return eggsPerMonth;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + country +". Я несу " + eggsPerMonth +" яиц в месяц.";}
    UkrainianHen(String s){
        this.country = s;
    }
}