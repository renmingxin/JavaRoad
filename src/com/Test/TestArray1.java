package com.Test;

public class TestArray1 {
    public static void main(String[] args){
        int size = 5;
        double[] myList = new double[size];
        myList[0] = 2;
        myList[1] = 3;
        myList[2] = 4;
        myList[3] = 5;
        myList[4] = 6;

        double total = 0;
        for (int i =0;i<size;i++){
            System.out.println(myList[i]);
            total  += myList[i];
        }
        System.out.print(total);
    }
}
