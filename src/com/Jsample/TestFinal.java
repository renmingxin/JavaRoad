package com.Jsample;

public class TestFinal {
    final int value = 10;
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Mangager";

    public static void main(String[] args){
//        TITLE = "aaaa";
        TestFinal test = new TestFinal();
        System.out.println(test.value);
        System.out.println(test.BOXWIDTH);
        System.out.println(test.TITLE);
    }

}
