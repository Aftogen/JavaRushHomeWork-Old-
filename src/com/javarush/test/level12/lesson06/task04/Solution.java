package com.javarush.test.level12.lesson06.task04;

/* Класс Cow от Animal
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    interface Drawable
    {
        void draw();
    }
    interface HasValue
    {
        int getValue();
    }

    interface Element extends Drawable
    {
        int getX();

    }

    public class Lol implements Element{
        public int getX(){ return  10;}
        public void draw(){}
    }
}
