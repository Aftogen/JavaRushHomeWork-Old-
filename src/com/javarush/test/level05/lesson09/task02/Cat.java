package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int weight;
    int age;
    String colour;
    String addres;

    public Cat(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.addres = null;
        this.colour = null;
    }

    public Cat(String name, int weight, int  age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.addres = null;
        this.colour = null;
    }

    public Cat(String name, int age) {
        this.weight = 5;
        this.name = name;
        this.age = age;
        this.addres = null;
        this.colour = null;
    }

    public Cat(int weight, String colour) {
        this.name = null;
        this.age = 5;
        this.addres = null;
        this.weight = weight;
        this.colour = colour;
    }

    public Cat(int weight, String colour, String addres) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.colour = colour;
        this.addres = addres;
    }

}
