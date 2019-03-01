package com.Test;

public class TestJavaArgument {
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("没有参数");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("最大值是:"+ result);
    }
    public static void main(String[]  args){
        printMax(34,3,3,2,100);
        printMax(new double[]{2,3,4,50});
        printMax();
    }
}
