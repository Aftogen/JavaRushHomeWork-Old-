package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        String Nstr = reader.readLine();
        int Nint = Math.abs(Integer.parseInt(Nstr));

        for (int i = 0; i< Nint; i++) {
            String Astr = reader.readLine();
            int A = Integer.parseInt(Astr);
            if (A > maximum) {
                maximum = A;
            }
        }


        System.out.println(maximum);
    }
}
