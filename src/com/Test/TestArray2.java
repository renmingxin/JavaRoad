package com.Test;

public class TestArray2 {
    public static void go(String name){
        System.out.print(name);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] myList = {2,3,4,5};
        for (int element:myList){
            System.out.print(element);
        }
        System.out.print("\n");
        printArray(new int[]{3, 1, 2, 6, 4, 2});
        System.out.print("\n");
        int[] aaa = reverse(new int[]{1,2,3});
        for (int element:aaa){
            System.out.print(element);
        }
        System.out.print("\n");
        go("阿瑟东");
    }
}
