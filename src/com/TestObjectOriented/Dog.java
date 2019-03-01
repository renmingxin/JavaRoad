package com.TestObjectOriented;

public class Dog {
    private String name;
    private int id;
    public Dog(String myName, int myid){
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"吃");
    }
    public void run(){
        System.out.println(name+"跑");
    }
    public void say(){
        System.out.println("大家好！"+ id +"号"+name);
    }
    public static void main(String[] args){
        Dog dog =new Dog("旺财",1);
        dog.eat();
        dog.run();
        dog.say();
    }
}
