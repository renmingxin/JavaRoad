package com.Test;

public class TestArguments {
    public static void main(String args[]){
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+ i +"]:" + args[i]);
        }
    }
}
