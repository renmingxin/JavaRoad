package com.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader2 {
    public static void main(String args[]) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("请输入");
        System.out.println("输入“end”退出。.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
