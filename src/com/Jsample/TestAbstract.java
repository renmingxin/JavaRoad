package com.Jsample;

public abstract class TestAbstract {
    private String name;
    private double price;
    private String color;

    abstract void go();
    abstract void changeColor();
}

class sonClass extends TestAbstract{
    void go(){
        System.out.println("go");
    }
    void changeColor(){
        System.out.println("color");
    }
    public static void main(String[] args){
        sonClass son = new sonClass();
        son.go();
        son.changeColor();
    }
}