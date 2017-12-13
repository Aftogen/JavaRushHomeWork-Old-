package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = 5;
        int i, j, temp;
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }

        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < size; ++i)
            System.out.print(array[i] + " " + "\n");

    }
}



