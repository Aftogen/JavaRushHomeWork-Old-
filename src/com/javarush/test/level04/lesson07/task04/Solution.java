package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String aStr = reader.readLine();
        int a = Integer.parseInt(aStr);
        String bStr = reader.readLine();
        int b = Integer.parseInt(bStr);
        String cStr = reader.readLine();
        int c = Integer.parseInt(cStr);
        int countMinus = 0;
        int countPlus = 0;
        if (a>0)
            countPlus ++;
        else
            countMinus ++;
        if (b>0)
            countPlus ++;
        else
            countMinus ++;
        if (c>0)
            countPlus ++;
        else
            countMinus ++;
        System.out.println("количество отрицательных чисел: " + countMinus + "\n" + "количество положительных чисел: " + countPlus);
        */
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;
        while (!isExit)
        {
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }

    }
}
