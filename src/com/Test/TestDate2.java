package com.Test;

import java.util.Calendar;

public class TestDate2 {
    public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();
        c1.set(2018,12,20);
        System.out.println(c1.get(Calendar.YEAR));
    }
}
