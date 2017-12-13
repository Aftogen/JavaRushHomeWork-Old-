package com.javarush.test.level02.lesson08.task04;

//Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.

  //      Присвойте каждому животному владельца (owner).
public class Solution
{
    public static void main(String[] args)
    {
        Cat koshka = new Cat();
        Dog sobaka = new Dog();
        Fish fish = new Fish();
        sobaka.owner = new Woman();
        koshka.owner = sobaka.owner;
        fish.owner = sobaka.owner;

//напишите тут ваш код
    }

    public static class Cat
    {
        public Woman owner;
    }

    public static class Dog
    {
        public Woman owner;
    }

    public static class Fish
    {
        public Woman owner;
    }

    public static class Woman
    {
    }
}