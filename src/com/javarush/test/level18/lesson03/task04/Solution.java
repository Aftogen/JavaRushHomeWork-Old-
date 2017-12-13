package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
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

        int minValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(minValue>entry.getValue()) minValue = entry.getValue();
        }

        // got min value of count

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(minValue==entry.getValue()) System.out.print(entry.getKey() + " ");
        }


        stream.close();
        reader.close();
    }
}
