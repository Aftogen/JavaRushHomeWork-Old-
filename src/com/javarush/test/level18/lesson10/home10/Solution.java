package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<Integer, byte[]> partsMap = new TreeMap<>();
        int partIndex;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNamePart;
        String fileNameResult="";
        FileInputStream partFile;


        while (!(fileNamePart=reader.readLine()).equals("end")){
            partFile = new FileInputStream(fileNamePart);
            partIndex = Integer.parseInt(fileNamePart.substring(fileNamePart.lastIndexOf(".part")+5, fileNamePart.length()));
            fileNameResult = fileNamePart.substring(0, fileNamePart.lastIndexOf("."));
            byte[] partBytes = new byte[partFile.available()];
            partFile.read(partBytes);
            partsMap.put(partIndex, partBytes);
            partFile.close();
        }
        reader.close();

        FileOutputStream resultFile = new FileOutputStream(fileNameResult);

        for (Map.Entry<Integer, byte[]> pair : partsMap.entrySet()){
            resultFile.write(pair.getValue());
        }
        resultFile.close();

    }
}
