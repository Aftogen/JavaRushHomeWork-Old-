package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        // Считываем с консоли 2 имени файла:
        Scanner scanner = new Scanner(System.in);
        FileReader reader = new FileReader(scanner.nextLine());
        FileWriter writer = new FileWriter(scanner.nextLine());
        scanner.close(); //закрываем поток с консоли

        // Загоняем в строку всю информацию из 1го файла:
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            int data = reader.read();
            sb.append((char) data);
        }
        String data = sb.toString();
        String result = data.replaceAll("\\.","!");
        writer.write(result);

        reader.close();
        writer.close();

    }
}
