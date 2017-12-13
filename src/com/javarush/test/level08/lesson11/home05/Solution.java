package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] m = s.toCharArray();
        for (int i = 0; i < m.length; i++) {

            if (i == 0 && m[i]!=' ') {
                m[i] = Character.toUpperCase(m[i]);
            }
            else if (m[i]==' ' && m[i+1]!=' '){
                m[i+1] = Character.toUpperCase(m[i+1]);
            }
        }
        for (int i = 0; i<m.length; i++){
            System.out.print(m[i]);
        }
    }


}
