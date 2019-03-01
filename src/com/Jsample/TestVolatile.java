package com.Jsample;

public class TestVolatile implements Runnable{
    private volatile boolean active;
    private int num = 0;
    public void run(){
        active = true;
        while(active){
            System.out.print("a");
        }
    }
    public void stop(){
        active = false;
    }
    public static void main(String[] args){

        TestVolatile test = new TestVolatile();
        test.run();
    }
}
