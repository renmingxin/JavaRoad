package com.Test;

import java.io.File;

public class TestCreateDir {
    public static void main(String[] args){
        String dirname = "E:/firstJava/src/com/newDir";
        File d = new File(dirname);
        d.mkdirs();
    }
}
