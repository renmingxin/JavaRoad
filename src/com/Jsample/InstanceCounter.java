package com.Jsample;

public class InstanceCounter {
    private static int num = 0;
    protected  static int getNum(){
        return num;
    }
    private static void addNum(){
        num++;
    }
//    InstanceCounter(){
//        InstanceCounter.addNum();
//    }
    public static void main(String[] args){
        System.out.print("开始" + InstanceCounter.getNum() + "***" );
        InstanceCounter ins = new InstanceCounter();
        for (int i = 0; i < 10; i++) {
            ins.addNum();
        }
        System.out.print(ins.getNum());
    }
}
