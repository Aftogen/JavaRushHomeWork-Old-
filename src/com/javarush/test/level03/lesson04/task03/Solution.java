package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "gosha1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "gosha2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "gosha3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "gosha4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "gosha5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "gosha6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "gosha7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "gosha8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "gosha9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "gosha10";
        Protos protos1 = new Protos();
        protos1.name = "zul1";
        Protos protos2 = new Protos();
        protos2.name = "zul2";
        Protos protos3 = new Protos();
        protos3.name = "zul3";
        Protos protos4 = new Protos();
        protos4.name = "zul4";
        Protos protos5 = new Protos();
        protos5.name = "zul5";
        Terran terran1 = new Terran();
        terran1.name = "jim1";
        Terran terran2 = new Terran();
        terran2.name = "jim2";
        Terran terran3 = new Terran();
        terran3.name = "jim3";
        Terran terran4 = new Terran();
        terran4.name = "jim4";
        Terran terran5 = new Terran();
        terran5.name = "jim5";
        Terran terran6 = new Terran();
        terran6.name = "jim6";
        Terran terran7 = new Terran();
        terran7.name = "jim7";
        Terran terran8 = new Terran();
        terran8.name = "jim8";
        Terran terran9 = new Terran();
        terran9.name = "jim9";
        Terran terran10 = new Terran();
        terran10.name = "jim10";
        Terran terran11 = new Terran();
        terran11.name = "jim11";
        Terran terran12 = new Terran();
        terran12.name = "jim12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}