package com.haishili.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author haishili
 * @date 2025/4/17
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方法一
    //File(url)
    @Test
    public void createFile01() {
        try {
            new File("d://test.txt").createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //方法二
    //File(parentFile,fileName)
    @Test
    public void createFile02() {
        File parentFile = new File("d://");
        String fileName = "test.txt";
        try {
            new File(parentFile,fileName).createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //方法三
    //File(parentPath,childPath)
    @Test
    public void createFile03() {
        String parentPath = "d://";
        String fileName = "test2.txt";
        try {
            new File(parentPath,fileName).createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
