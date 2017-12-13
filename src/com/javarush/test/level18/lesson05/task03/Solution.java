package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream stream1 = new FileInputStream(fileName1);
        FileOutputStream stream2 = new FileOutputStream(fileName2);
        FileOutputStream stream3 = new FileOutputStream(fileName3);
        int stream1Size = stream1.available();
        if (stream1.available() > 0) {
            byte[] buffer = new byte[stream1.available()];
            int count = stream1.read(buffer);
            if (stream1Size % 2 == 0) {
                stream2.write(buffer, 0, count / 2);
                stream3.write(buffer, count / 2, count / 2);

            } else {
                stream2.write(buffer, 0, count / 2 + 1);
                stream3.write(buffer, count / 2 + 1, count / 2);
            }
        }
        reader.close();
        stream1.close();
        stream2.close();
        stream3.close();
    }
}
