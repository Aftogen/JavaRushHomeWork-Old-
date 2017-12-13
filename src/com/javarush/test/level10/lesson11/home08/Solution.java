package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);

    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] array = new ArrayList[5];
        ArrayList<String> list = new ArrayList<String>();
        list.add("lol1");
        list.add("lol2");
        list.add("lol3");

        for (int i = 0 ; i<array.length;i++){
           array[i] = list;
        }



        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}