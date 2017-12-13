package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
       /* BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);*/
        BufferedReader reader = new BufferedReader(new FileReader("D:/data1.txt"));
        FileWriter writer = new FileWriter("D:/data2.txt");
        Pattern p = Pattern.compile(".{7,}");
        Matcher m;
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String s : words) {
                m = p.matcher(s);
                if (m.find()) sb.append(s+",");
            }

        }
        writer.write(sb.substring(0,sb.length()-1));
        reader.close();
        writer.close();

    }
}
