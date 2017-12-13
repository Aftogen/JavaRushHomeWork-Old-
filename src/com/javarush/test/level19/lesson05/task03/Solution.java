package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String result = sb.toString();

        Pattern p =Pattern.compile("\\b(\\d+)\\b");
        Matcher m = p.matcher(result);
        while (m.find()){
            writer.write(m.group()+" ");
        }

        // Закрываем потоки файлов:
        reader.close();
        writer.close();

    }
}
