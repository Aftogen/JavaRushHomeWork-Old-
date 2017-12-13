package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String x = "Мама";
        String y = "Мыла";
        String z = "Раму";
        System.out.println(x+y+z);
        System.out.println(x+z+y);
        System.out.println(y+z+x);
        System.out.println(y+x+z);
        System.out.println(z+x+y);
        System.out.println(z+y+x);
    }
}