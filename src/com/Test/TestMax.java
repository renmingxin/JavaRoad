package com.Test;

public class TestMax {
    public static void main(String[] args){
        int aa = max(10,20);
        System.out.println(aa);
        System.out.println(max(22.3,20.2));
    }

    public static int max(int a,int b){
        int maxNum = 0;
        if (a>b){
            maxNum = a;
        }else{
            maxNum = b;
        }
        return maxNum;
    }

    //重载
    public static double max(double num1, double num2) {

        double aa = 3.3;
        return aa;

    }
}
