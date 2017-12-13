package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        String lol = a + " " + b + " " + c;

        if (a>=c && c>=b)
            lol = a + " " + c + " " + b;
        if (b>=a && a>=c)
            lol = b + " " + a + " " + c;
        if (b>=c && c>=a)
            lol = b + " " + c + " " + a;
        if (c>=a && a>=b)
            lol = c + " " + a + " " + b;
        if (c>=b && c>=a)
            lol = c + " " + b + " " + a;

        System.out.println(lol);

    }
}
