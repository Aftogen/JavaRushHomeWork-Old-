package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Url = reader.readLine();

        String[] testArray = Url.split("\\?");  // разбиваем строку на ДО и ПОСЛЕ знака "?"
        String[] parameters = testArray[1].split("&"); //создаем массив из строк, разделенных знаком "&"
        ArrayList<String> params = new ArrayList<>();  // создаем список №1 (для занесения параметров)
        ArrayList<Double> objDoubles = new ArrayList<>(); // создаем список №2 (для всех Double)
        ArrayList<String> objStrings = new ArrayList<>(); // создаем список №3 (для всех String)

        for (String s: parameters){
            if (s.startsWith("obj=")){ //если есть "obj" и "=" - работаем как с obj
                String[] obj = s.split("=");
                try //если не парсится в Double - отправляем в String
                {
                    double lol = Double.parseDouble(obj[1]);
                    objDoubles.add(lol); //пополняем список №2
                    params.add(obj[0]); // пополняем список №1
                }
                catch (NumberFormatException e)
                {
                    objStrings.add(obj[1]); //пополняем список №3
                    params.add(obj[0]); //пополняем список №1
                }
            }
            else if (s.contains("=") && !s.contains("obj=")){ //если есть "=", но нет "obj" - вычленяем только параметр
                String[] param = s.split("=");
                params.add(param[0]); //пополняем список №1
            } else params.add(s); //пополняем список №1
        }

        for (String s : params){ System.out.print(s+ " ");} //выводим все параметры
        System.out.println(); // конец строки для соответствия заданию
        for (Double s : objDoubles){alert(s);} // выводим все Double
        for (String s : objStrings){alert(s);} // выводим все String

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
