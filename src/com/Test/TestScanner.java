package com.Test;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");
        //判断是否还有输入
        if (scan.hasNext()){
            String str1 = scan.next();
            System.out.println("输入数据为：" +  str1);
        }
        scan.close();
    }
}
