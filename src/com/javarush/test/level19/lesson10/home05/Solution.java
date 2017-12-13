package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0])); // TODO: 24.10.2016 fix to main
        FileWriter writer = new FileWriter(args[1]);
        Pattern p = Pattern.compile("\\d");
        Matcher m;
        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String s : words) {
                m = p.matcher(s);
                if (m.find()) writer.write(s+" ");
            }
        }
        reader.close();
        writer.close();
    }
}
