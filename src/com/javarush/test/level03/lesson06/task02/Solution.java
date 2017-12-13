package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(kek(1));
        System.out.println(kek(2));
        System.out.println(kek(3));
        System.out.println(kek(4));
        System.out.println(kek(5));
        System.out.println(kek(6));
        System.out.println(kek(7));
        System.out.println(kek(8));
        System.out.println(kek(9));
        System.out.println(kek(10));

    }
    public static String kek(int a){
        String s = (a*1 + " " + a*2 + " " + a*3 + " " + a*4 + " " + a*6 + " " + a*7 + " " + a*8 + " " + a*9 + " " + a*10) ;
        return  s;
    }
}