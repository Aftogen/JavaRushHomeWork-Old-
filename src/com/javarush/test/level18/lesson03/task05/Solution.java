package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream stream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> set = new HashSet<>();


        while (stream.available()>0){
            int byteKey = stream.read();
            set.add(byteKey);
        }
        // got hashset with unique values of bytes

        ArrayList<Integer> sortedList = new ArrayList<Integer>(set);
        Collections.sort(sortedList);

        //sorted

        for (Integer name : sortedList){
            System.out.print(name+" ");
        }

        //outputed

        stream.close();
        reader.close();

        //closed
    }
}
