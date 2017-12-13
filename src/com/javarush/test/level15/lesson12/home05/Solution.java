package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(){}
    public Solution(Short a){}
    public Solution(Object x){}

    Solution(Integer a){}
    Solution(Long a){}
    Solution(short a){}

    protected Solution(String a, int x){}
    protected Solution(String a, Short x){}
    protected Solution(String a, Object x){}

    private Solution(Integer a, String x){}
    private Solution(Integer a, Short x){}
    private Solution(Integer a, Object x){}


}

