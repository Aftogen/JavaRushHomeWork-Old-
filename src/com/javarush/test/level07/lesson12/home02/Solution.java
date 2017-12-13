package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String Nstr = reader.readLine();
        String Mstr = reader.readLine();
        int N = Integer.parseInt(Nstr);
        int M = Integer.parseInt(Mstr);

        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            String temp = list.get(0);
            list.remove(0);
            list.add(temp);


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


        }

    }
}
