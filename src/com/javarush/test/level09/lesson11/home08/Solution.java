package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] massive0 = {1,2,3,4,5};
        int[] massive1 = {1,2};
        int[] massive2 = {1,2,3,4};
        int[] massive3 = {1,2,3,4,5,6,7};
        int[] massive4 = new int[0];
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(massive0);
        list.add(massive1);
        list.add(massive2);
        list.add(massive3);
        list.add(massive4);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
