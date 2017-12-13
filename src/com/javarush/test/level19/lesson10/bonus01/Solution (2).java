package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
               строка0            ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
               строка5            ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5

строка1        строка1
строка2        строка3
строка3        строка5
строка4        строка0
строка5        строка1
строка1        строка3
строка2        строка5
строка3        строка4
строка4
строка5





*/
/*

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader file1Reader = new BufferedReader(new FileReader(scanner.nextLine()));
        BufferedReader file2Reader = new BufferedReader(new FileReader(scanner.nextLine()));
        int count = 2;
        ArrayList<String> file1List = new ArrayList<>();
        ArrayList<String> file2List = new ArrayList<>();
        while (file1Reader.ready()) {file1List.add(file1Reader.readLine());}
        while (file2Reader.ready()) {file2List.add(file2Reader.readLine());}
        int j=0;
        for (int i=0;i<file1List.size();i++){
            if (file1List.get(i).equals(file1List.get(j))) {
                lines.add(new LineItem(Type.ADDED, file1List.get(i)));
                j++;
                i++;
            }
            else if (file1List.get(i).equals(file2List.get(j+1))){

            }


        }



        */
/* for (LineItem line : lines) {
            System.out.println(line);
        }*//*

        file1Reader.close();
        file2Reader.close();
        scanner.close();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return this.type + " " + this.line;
        }
    }
}
*/
