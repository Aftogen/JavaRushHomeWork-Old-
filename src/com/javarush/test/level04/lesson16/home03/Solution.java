package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        for (boolean exit = false; !exit; ) {


            String aStr = reader.readLine();
            int a = Integer.parseInt(aStr);
            b = b + a;

            exit = aStr.equals("-1");

        }
        System.out.println(b);

    }
}
