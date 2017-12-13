package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name  = reader.readLine();
        for (int i =1; i<=10; i++) {
            System.out.println(name + " любит меня.");
        }*/

        /*int x = 100, y = 1;
        boolean a;
        a = x>y?false:true;
        int b;
        b = x>y?0:1;
                System.out.println(a + " " + b);
                */

        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Перед оператором break.");
                    if (t) {
                        break first; // выход из блока second
                    }
                    System.out.println("Данный оператор никогда не выполнится");
                }
                System.out.println("Данный оператор никогда не выполнится ");
            }
            System.out.println("Данный оператор размещен после блока second.");
        }
    }
}

