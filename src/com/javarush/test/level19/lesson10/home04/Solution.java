package com.javarush.test.level19.lesson10.home04;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(scanner.nextLine()));
        int count;
        while (reader.ready()) {
            String line = reader.readLine();
            String[] data = line.split(" ");
            Set<String> set = new HashSet<String>(Arrays.asList(data));

            count = 0;
            for (String s : set){
                if (words.contains(s)) count++;
            }
            if (count==2) System.out.println(line);

        }
        scanner.close();
        reader.close();
    }
}
