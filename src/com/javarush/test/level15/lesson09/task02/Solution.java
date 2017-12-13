package com.javarush.test.level15.lesson09.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Статики 2
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
*/

public class Solution {
    static
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String aStr = reader.readLine();
            String bStr = reader.readLine();
            reader.close();
            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);
            Solution.A = a;
            Solution.B = b;
        }
        catch (NumberFormatException x)
        {
            System.out.println(x);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
