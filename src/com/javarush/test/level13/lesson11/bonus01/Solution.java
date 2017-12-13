package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inStream = new FileInputStream(fileName);

        BufferedReader lineReader = new BufferedReader(new InputStreamReader(inStream));
        String line;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while ((line = lineReader.readLine())!=null) {
            int value = Integer.parseInt(line);
            if (value%2==0) list.add(value);
        }
        for (int i = 0; i<list.size(); i++){
            for (int j = 0; j<list.size(); j++){
                if (list.get(j)>list.get(i)) {
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        inStream.close();
    }
}
