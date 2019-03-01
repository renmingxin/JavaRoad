package com.Jsample;

public class Dog {
    int dogAge;
    public Dog(String name){
        System.out.print("小狗的名字叫："+name);
    }
    public void setAge(int age){
        dogAge = age;
    }
    public int getAge(){
        System.out.print("小狗的年龄为:"+ dogAge);
        return dogAge;
    }

    public static void main(String[] args){
        Dog myDog = new Dog("旺财");
        myDog.setAge(3);
        myDog.getAge();
        System.out.print("变量值:" + myDog.dogAge);
        Cat myCat = new Cat("小猫");
    }
}
class Cat {
    public Cat(String name){
        System.out.print("猫的名字叫："+name);
    }
}