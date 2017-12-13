package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static volatile Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName=reader.readLine()).equals("exit")){
            new ReadThread(fileName).start();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        Map<Integer, Integer> byteMap = new HashMap<>();

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                Map<Integer, Integer> chars = new HashMap<Integer, Integer>();
                FileInputStream fileInputStream = new FileInputStream(fileName);
                int max = Integer.MIN_VALUE;
                int charKey = 0;
                while (fileInputStream.available() > 0)
                {
                    int data = fileInputStream.read();
                    if(chars.containsKey(data))
                    {
                        chars.put(data, chars.get(data) + 1);
                    }
                    else
                    {
                        chars.put(data, 1);
                    }
                }
                for (Map.Entry<Integer, Integer> pair : chars.entrySet())
                {
                    max = max >= pair.getValue() ? max : pair.getValue();
                    charKey = max == pair.getValue() ? pair.getKey() : charKey;
                }
                resultMap.put(fileName, charKey);
                fileInputStream.close();

            } catch (Exception e){ /*NOP*/

                }

        }

    }
}
