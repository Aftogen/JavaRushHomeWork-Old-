package com.javarush.test.level15.lesson12.home05;


public class SubSolution extends Solution {
    public SubSolution() {
    }
    public SubSolution(Short a) {
        super(a);
    }
    public SubSolution(Object x) {
        super(x);
    }

    SubSolution(Integer a) {
        super(a);
    }
    SubSolution(Long a) {
        super(a);
    }
    SubSolution(short a) {
        super(a);
    }

    protected SubSolution(String a, int x) {
        super(a, x);
    }
    protected SubSolution(String a, Short x) {
        super(a, x);
    }
    protected SubSolution(String a, Object x) {
        super(a, x);
    }

    private SubSolution(Integer a, String x){}
    private SubSolution(Integer a, Short x){}
    private SubSolution(Integer a, Object x){}

}
