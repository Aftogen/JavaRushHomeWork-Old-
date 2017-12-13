package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount) {
        if ((mount >= 1) && (mount <= 2))
            System.out.println("зима");
        else if ((mount >= 3) && (mount <= 5))
            System.out.println("весна");
        else if ((mount >= 6) && (mount <= 8))
            System.out.println("лето");
        else if ((mount >= 9) && (mount <= 11))
            System.out.println("осень");
        else if (mount == 12)
            System.out.println("зима");
    }
}