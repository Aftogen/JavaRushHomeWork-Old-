package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);


        byte[] buffer = new byte[inputStream.available()];
        int count = inputStream.read(buffer);

        for (int i=0;i<buffer.length;i++){
            outputStream.write(buffer[buffer.length-i-1]);
        }





        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
