package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandDad1 = new Human();
        grandDad1.name = "Petrovich";
        grandDad1.age = 70;
        grandDad1.sex = true;

        Human grandDad2 = new Human();
        grandDad2.name = "Ivanich";
        grandDad2.age = 71;
        grandDad2.sex = true;

        Human grandMom1 = new Human();
        grandMom1.name = "Jin";
        grandMom1.age = 65;
        grandMom1.sex = false;

        Human grandMom2 = new Human();
        grandMom2.name = "lsll";
        grandMom2.age = 68;
        grandMom2.sex = false;

        Human Mom1 = new Human();
        Mom1.name = "Telka";
        Mom1.age = 40;
        Mom1.sex = false;
        Mom1.father = grandDad1;
        Mom1.mother = grandMom1;

        Human Dad2 = new Human();
        Dad2.name = "Muzhik";
        Dad2.age = 45;
        Dad2.sex = true;
        Dad2.father = grandDad2;
        Dad2.mother = grandMom2;

        Human Kid1 = new Human();
        Kid1.name = "Petrovich1";
        Kid1.age = 12;
        Kid1.sex = true;
        Kid1.father = Dad2;
        Kid1.mother = Mom1;

        Human Kid2 = new Human();
        Kid2.name = "Petrovich2";
        Kid2.age = 14;
        Kid2.sex = true;
        Kid2.father = Dad2;
        Kid2.mother = Mom1;

        Human Kid3 = new Human();
        Kid3.name = "Petrovich3";
        Kid3.age = 15;
        Kid3.sex = true;
        Kid3.father = Dad2;
        Kid3.mother = Mom1;

        System.out.println(grandDad1.toString());
        System.out.println(grandDad2.toString());
        System.out.println(grandMom1.toString());
        System.out.println(grandMom2.toString());
        System.out.println(Mom1.toString());
        System.out.println(Dad2.toString());
        System.out.println(Kid1.toString());
        System.out.println(Kid2.toString());
        System.out.println(Kid3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father = null;
        Human mother = null;


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
