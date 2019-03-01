package com.Test;

public class TestConstructor {
    public static void main(String[] args){
        Myclass c1 = new Myclass();
        Myclass c2 = new Myclass();
        System.out.println(c1.x);
        System.out.println(c2.x);
    }
}
class Myclass {
    int x;
    Myclass(){
        x = 10;
    }
}
