package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aStr = reader.readLine();
        int a = Integer.parseInt(aStr);
        String bStr = reader.readLine();
        int b = Integer.parseInt(bStr);
        int c = a;
        if (b<a)
            c = b;
        System.out.println(c);

    }
}