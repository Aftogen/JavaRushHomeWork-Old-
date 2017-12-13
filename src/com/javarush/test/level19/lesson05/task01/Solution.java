package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.nextLine();
        String outputFile = scanner.nextLine();
        scanner.close();
        FileReader reader = new FileReader(inputFile);
        FileWriter writer = new FileWriter(outputFile);
        int count =0;
        while (reader.ready()){
            int data = reader.read();
            if (count%2==1) writer.write(data);
            count++;
        }
        reader.close();
        writer.close();
    }
}
