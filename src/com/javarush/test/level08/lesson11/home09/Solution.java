package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {


    }

    public static boolean isDateOdd(String date) throws ParseException {
        Calendar MyDate = new GregorianCalendar();
        Date checkDate = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH).parse(date);
        MyDate.setTime(checkDate);

        boolean chetnost;


        if (MyDate.get(Calendar.DAY_OF_YEAR) % 2 ==0) chetnost = false;
        else chetnost=true;



        return chetnost;
    }
}
