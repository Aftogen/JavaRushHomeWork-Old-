package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        //Считать с консоли 2 имени файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1= reader.readLine();
        String fileName2= reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<buffer.length;i++){ sb.append((char) buffer[i]); }

        String text = new String(sb);
        String[] strings = text.split(" ");

        StringBuilder result = new StringBuilder();
        for (String s : strings){
            int n = (int) Math.round(Double.valueOf(s));
            result.append(n+" ");
        }
        String stringResult = new String(result);


        FileWriter fileWriter = new FileWriter(fileName2);
        fileWriter.write(stringResult);
        fileWriter.close();


    }
}
