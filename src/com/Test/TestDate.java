package com.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args){
        Date date = new Date();
        System.out.print(date);
        System.out.print("\n");
        System.out.println(date.toString());

        //格式化日期
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("时间:" + ft.format(date));
    }
}
