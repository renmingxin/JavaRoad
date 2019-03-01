package com.Test;

public class TestConsoleWrite {
    public static void main(String args[]){
        int b;
        b = 'A';
        //不推荐使用write 推荐使用print 和 println
        System.out.write(b);
        System.out.write('\n');
    }
}
