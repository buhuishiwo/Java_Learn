package com.haishili.file;

import org.junit.Test;

import java.io.File;

/**
 * @author haishili
 * @date 2025/4/17
 */
public class Directorys {
    public static void main(String[] args) {

    }
    @Test
    public void createDirectory() {
        String filepath = "d:\\test.txt";
        File file = new File(filepath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            }
        }
    }
}
