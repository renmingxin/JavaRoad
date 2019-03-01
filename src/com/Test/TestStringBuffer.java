package com.Test;

public class TestStringBuffer {
    public static void main(String[] args){
        StringBuffer sBuffer = new StringBuffer("网址:");
        sBuffer.append("www.");
        sBuffer.append("baidu.");
        sBuffer.append("com");
//      System.out.print(sBuffer.reverse());
//      System.out.print(sBuffer.insert(2,":::::"));
        System.out.print(sBuffer.capacity());
    }

}
