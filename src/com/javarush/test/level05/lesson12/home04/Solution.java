package com.javarush.test.level05.lesson12.home04;
import java.util.Date;
import java.text.SimpleDateFormat;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format.format(d));
    }
}
