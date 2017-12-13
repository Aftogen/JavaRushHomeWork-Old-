package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String cStr = reader.readLine();
        int c = Integer.parseInt(cStr);
        String dStr = reader.readLine();
        int d = Integer.parseInt(dStr);
        int x = a;
        if (b>x)
            x = b;
        if (c>x)
            x = c;
        if (d>x)
            x = d;
        System.out.println(x);

    }
}
