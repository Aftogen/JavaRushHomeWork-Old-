package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        byte[] lol = new byte[fileInputStream.available()];
        fileInputStream.read(lol);
        int count = 0;

        for (byte letter :lol) {
            if ((letter>64 & letter<91) || (letter>96 & letter<123)) count++;
        }
        System.out.println(count);
        fileInputStream.close();

    }
}
