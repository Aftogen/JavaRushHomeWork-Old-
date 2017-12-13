package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static void print(int a){
        System.out.println(a);
    }
    public static void print(Integer a){
        System.out.println(a);
    }
    public static void print(String a){
        System.out.println(a);
    }
    public static void print(Double a){
        System.out.println(a);
    }
    public static void print(Integer a, String x){
        System.out.println(a+x);
    }
}
