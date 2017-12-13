package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
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
        String result = data.replaceAll("(\\p{Punct}|\\n|^)","");
        System.out.println(result);
        writer.write(result);
        reader.close();
        writer.close();

    }
}
