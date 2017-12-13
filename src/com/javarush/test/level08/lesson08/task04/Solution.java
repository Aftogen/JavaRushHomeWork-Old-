package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("APRIL 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1981"));
        map.put("Stallone4", new Date("JULY 1 1982"));
        map.put("Stallone5", new Date("AUGUST 1 1983"));
        map.put("Stallone6", new Date("JUNE 1 1984"));
        map.put("Stallone7", new Date("JUNE 1 1985"));
        map.put("Stallone8", new Date("JUNE 1 1986"));
        map.put("Stallone9", new Date("JUNE 1 1987"));
        map.put("Stallone0", new Date("JUNE 1 1988"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        Iterator<Map.Entry<String , Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Date d = iterator.next().getValue();
            if(d.getMonth() > 4 && d.getMonth() < 8)
                iterator.remove();
        }



    }
}
