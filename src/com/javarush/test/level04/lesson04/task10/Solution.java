package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        String sum = " ";

        if (a==b)
            sum = a + " " + b;
        if (a==c)
            sum = a + " " + c;
        if (b==c)
            sum = b + " " + c;
        if (a==b && b==c)
            sum = a + " " + b + " " + c;

        System.out.println(sum);
    }
}