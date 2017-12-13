package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;


public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1= reader.readLine();
        String fileName2= reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        int length1 = fileInputStream.available();
        int length2 = fileInputStream2.available();

        byte[] buffer1 = new byte[length1];  //create array1
        byte[] buffer2 = new byte[length2];  //create array2


        fileInputStream.read(buffer1);
        fileInputStream2.read(buffer2);
        fileInputStream.close();
        fileInputStream2.close();

        byte[] bufferALL = concatArray(buffer2,buffer1);




        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        fileOutputStream.write(bufferALL);
        fileOutputStream.close();



    }
    public static byte[] concatArray(byte[] a, byte[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        byte[] r = new byte[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }
}
