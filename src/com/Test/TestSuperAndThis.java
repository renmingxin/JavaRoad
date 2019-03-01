package com.Test;

public class TestSuperAndThis {
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal:eat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog:eat");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }
}
