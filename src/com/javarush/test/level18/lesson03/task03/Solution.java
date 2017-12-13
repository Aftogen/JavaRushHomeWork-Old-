package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream stream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


        while (stream.available()>0){
            int byteKey = stream.read();
            if (map.containsKey(byteKey)){
                int value = map.get(byteKey);
                map.put(byteKey,++value);
            }
            else map.put(byteKey,1);
        }
        // got map with count of bytes

        int maxValue = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(maxValue<entry.getValue()) maxValue = entry.getValue();
        }

        // got max value of count

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(maxValue==entry.getValue()) System.out.print(entry.getKey() + " ");
        }


        stream.close();
        reader.close();
    }
}
