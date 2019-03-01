package com.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
        char c;
        //使用System.in 创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下q键退出");
        //读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
