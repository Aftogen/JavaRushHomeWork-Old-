package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Nastya", false, 15, null , null, null );
        Human child2 = new Human("Sasha", true, 12, null , null, null);
        Human child3 = new Human("Ignat", true, 8, null , null, null);

        Human papa = new Human("Nikolay", true, 35, child1, child2, child3);
        Human mama = new Human("Alina", false, 30, child1, child2, child3);
        Human ded1 = new Human("VAsya", true, 60, papa, null, null);
        Human babka1 = new Human("Sveta", false, 60, papa, null, null);
        Human ded2 = new Human("Petr", true, 60, mama, null, null);
        Human babka2 = new Human("Nina", false, 60, mama, null, null);


        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;

        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            ArrayList<Human> children = new ArrayList<Human>();
            if (child1!=null)
                children.add(child1);
            if (child2!=null)
                children.add(child2);
            if (child3!=null)
                children.add(child3);
            this.children = children;

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}


/*
public static void main(String[] args)
    {
        Human ded1 = Human("VAsya", true, 60, Human child1, null);
        Human babka1 = Human("Sveta", false, 60, papa);
        Human ded2 = Human("Petr", true, 60, mama);
        Human babka2 = Human("Nina", false, 60, mama);
        Human papa = Human("Nikolay", true, 35, child1, child2, child3);
        Human mama = Human("Alina", false, 30, child1, child2, child3);
        Human child1 = Human("Nastya", false, 15);
        Human child2 = Human("Sasha", true, 12);
        Human child3 = Human("Ignat", true, 8);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            ArrayList<Human> children = new ArrayList<Human>();
            if (child1!=null)
                children.add(child1);
            if (child2!=null)
                children.add(child2);
            if (child3!=null)
                children.add(child3);
            this.children = children;

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }
 */