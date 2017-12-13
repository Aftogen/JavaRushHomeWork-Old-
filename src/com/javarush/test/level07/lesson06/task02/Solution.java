package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        String max = list.get(0);
        for (int i = 0; i < list.size() - 1; i++)
        {
            if (list.get(i).length() < list.get(i + 1).length())
            {
                max = list.get(i + 1);
            }
        }

        System.out.println(max);

        for (int i = 0; i < list.size(); i++)
        {
            if ((list.get(i).length() == max.length()) && list.get(i) != max)
            {
                System.out.println(list.get(i));
            }
        }
    }
}


/*
    public static void main(String[] args) throws Exception {
        // 1. Создай список строк.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        // 2. Считай с клавиатуры 5 строк и добавь в список.
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        // 3. Используя цикл, найди самую длинную строку в списке.
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).length() > max)
                max = j;
        }
        // 4. Выведи найденную строку на экран.
        System.out.println(list.get(max));

        // 5. Если таких строк несколько, выведи каждую с новой строки.
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).length() == max)
                System.out.println(list.get(j));
        }

    }
*/