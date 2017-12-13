package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inStream = new FileInputStream(fileName);
        ArrayList<String> list = new ArrayList<String>();

        for (;;){
            String s = reader.readLine();

            list.add(s);
            if (s.equals("exit")) break;

        }

        ArrayList<Integer> genome = new ArrayList<Integer>();


        OutputStream outStream = new FileOutputStream(fileName);
        for (int i = 0; i<list.size(); i++){

            char[] temp = list.get(i).toCharArray();

            for (int j = 0; j<temp.length; j++){


                outStream.write(temp[j]);

            }
            outStream.write(System.lineSeparator().getBytes());
        }
        System.out.println(System.lineSeparator());



        inStream.close();
        outStream.close();
    }
}
