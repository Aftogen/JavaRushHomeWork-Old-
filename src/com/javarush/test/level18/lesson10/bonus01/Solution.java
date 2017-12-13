package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        int data;
        int key = 10;
        if (args[0].equals("-e")){
            while (fileInputStream.available()>0){
                data = fileInputStream.read();
                fileOutputStream.write(data+key);
            }
        }
        if (args[0].equals("-d")){
            while (fileInputStream.available()>0){
                data = fileInputStream.read();
                fileOutputStream.write(data-key);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
