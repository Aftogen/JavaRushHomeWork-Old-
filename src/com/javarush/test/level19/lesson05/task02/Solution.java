package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        FileReader reader = new FileReader(scanner.nextLine());
        scanner.close();
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            int i = reader.read();
            sb.append((char) i);
        }
        String result = sb.toString();
        String[] words = result.split("[\\W]");
        int count=0;
        for(String s : words){
            if (s.equals("world")) count++;
        }
        System.out.println(count);
        reader.close();
    }
}
