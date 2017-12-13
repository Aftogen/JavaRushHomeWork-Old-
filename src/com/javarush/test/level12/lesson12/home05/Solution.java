package com.javarush.test.level12.lesson12.home05;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o)
    {
        String temp = null;
        if (o.getClass().getSimpleName().equals("Cat")) temp = "Кот";
        if (o.getClass().getSimpleName().equals("Tiger")) temp = "Тигр";
        if (o.getClass().getSimpleName().equals("Lion")) temp = "Лев";
        if (o.getClass().getSimpleName().equals("Bull")) temp = "Бык";
        if (o.getClass().getSimpleName().equals("Cow")) temp = "Корова";

        if (o.getClass().getSimpleName().equals("Animal")) temp = "Животное";

        return temp;
    }

    public static class Cat  extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger  extends Cat
    {
    }

    public static class Lion  extends Cat
    {
    }

    public static class Bull  extends Animal
    {
    }

    public static class Cow  extends Animal
    {
    }

    public static class Animal
    {
    }
}
