package com.javarush.test.level16.lesson07.task05;


public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("4");
        System.out.println("4");
        System.out.println("4");
        System.out.println("4");
        System.out.println("4");
    }
}
class Printer implements Runnable{
    public void run(){
        System.out.println("5");
        System.out.println("6");



    }
}