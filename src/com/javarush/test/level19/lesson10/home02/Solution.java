package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();

        while (reader.ready()){
            String[] data = reader.readLine().split(" ");
            Double value = Double.parseDouble(data[1]);
            String name = data[0];
            if (!map.containsKey(name))
                map.put(name, value);
            else
                map.put(name, map.get(name)+value);
        }

        reader.close();
        Double maxValue =0.0;
        for(Map.Entry<String, Double> pair : map.entrySet())
            if (pair.getValue()>maxValue) maxValue = pair.getValue();

        for(Map.Entry<String, Double> pair : map.entrySet())
            if (pair.getValue().equals(maxValue)) System.out.println(pair.getKey());
    }
}
