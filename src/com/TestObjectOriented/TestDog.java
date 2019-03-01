package com.TestObjectOriented;

public class TestDog extends Animal{
    public TestDog(String myname,int myId){
        super(myname,myId);
    }
    public static void main(String[] args){
        TestDog td = new TestDog("旺",2);
        td.eat();
        td.sleep();
        td.introduction();
    }
}
