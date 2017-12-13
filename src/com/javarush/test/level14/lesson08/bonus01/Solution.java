package com.javarush.test.level14.lesson08.bonus01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new NullPointerException("1");

        } catch (NullPointerException c)
        {
            exceptions.add(c);
        }
        try
        {
            throw new IOException("2");

        } catch (IOException x)
        {
            exceptions.add(x);
        }
        try
        {
            throw new ClassNotFoundException("3");

        } catch (ClassNotFoundException d)
        {
            exceptions.add(d);
        }
        try
        {
            throw new NoSuchFieldException("4");

        } catch (NoSuchFieldException y)
        {
            exceptions.add(y);
        }
        try
        {
            throw new NoSuchMethodException("5");

        } catch (NoSuchMethodException y)
        {
            exceptions.add(y);
        }
        try
        {
            throw new ReflectiveOperationException("6");

        } catch (ReflectiveOperationException y)
        {
            exceptions.add(y);
        }
        try
        {
            throw new ArithmeticException("7");

        } catch (ArithmeticException y)
        {
            exceptions.add(y);
        }
        try
        {
            throw new IllegalStateException("8");

        } catch (IllegalStateException y)
        {
            exceptions.add(y);
        }
        try
        {
            throw new ClassCastException("9");

        } catch (ClassCastException y)
        {
            exceptions.add(y);
        }





    }
}
