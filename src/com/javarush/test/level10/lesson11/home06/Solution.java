package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        String name0;
        int name1;
        boolean name2;
        long name3;
        short name4;
        double name5;



        public Human(String name0) {
            this.name0 = name0;
        }
        public Human(String name0, int name1) {
            this.name0 = name0;
            this.name1 = name1;
        }
        public Human(boolean name2, int name1) {
            this.name2 = name2;
            this.name1 = name1;
        }
        public Human(boolean name2, short name4) {
            this.name2 = name2;
            this.name4 = name4;
        }
        public Human(double name5, short name3) {
            this.name5 = name5;
            this.name3 = name3;
        }
        public Human(short name4, short name3) {
            this.name4 = name4;
            this.name3 = name3;
        }
        public Human(int name1, short name4) {
            this.name1 = name1;
            this.name4 = name4;
        }
        public Human(boolean name2, double name5) {
            this.name2 = name2;
            this.name5 = name5;
        }
        public Human(boolean name2, short name3, String name0) {
            this.name2 = name2;
            this.name3 = name3;
            this.name0 = name0;
        }
        public Human(boolean name2, short name3, int name1) {
            this.name2 = name2;
            this.name3 = name3;
            this.name1 = name1;
        }


    }
}
