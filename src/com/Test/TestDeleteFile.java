package com.Test;

import java.io.File;

public class TestDeleteFile {
    public static void main(String[] args){
        File folder = new File("../newDir");
        deleteFolder(folder);
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
