package com.Test;
import java.util.*;

public class TestSleep {
    public static void main(String[] args){
        try{
//            System.out.println(new Date());
//            Thread.sleep(1000*3);
//            System.out.println(new Date( ) + "\n");

            System.out.println("请等待3秒。。。。");
            Thread.sleep(1000*3);
            System.out.println("好了！");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
