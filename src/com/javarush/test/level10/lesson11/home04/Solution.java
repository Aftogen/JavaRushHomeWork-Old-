package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] sum = s.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for (char z : sum){
            list.add(z);
        }
        for (int j=0;j<40;j++){
            for (int i = 0; i<list.size();i++){
                System.out.print(list.get(i));
            }
            list.remove(0);
            System.out.println();
        }


    }

}
