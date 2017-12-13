package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        char[] allChars = string.toCharArray();
        ArrayList<Character> vowels = new ArrayList<Character>();
        ArrayList<Character> consonants = new ArrayList<Character>();

        for (int i = 0; i < allChars.length; ) {
            if (allChars[i] == ' ')
                i++;

            else if (isVowel(allChars[i])) {
                vowels.add(allChars[i]);
                i++;
            }
            else if (!isVowel(allChars[i])) {
                consonants.add(allChars[i]);
                i++;
            }

        }

        /*for (int i = 0; i < allChars.length; i++) {
            if (isVowel(allChars[i]) && allChars[i]!=' ')
                vowels.add(allChars[i]);
            else
                consonants.add(allChars[i]);
        }*/

        for (int j = 0; j < vowels.size(); j++) {
            System.out.print(vowels.get(j) + " ");
        }
        System.out.println();

        for (int x = 0; x < consonants.size(); x++) {
            System.out.print(consonants.get(x) + " ");
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
