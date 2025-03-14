package com.haishili;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNum = runtime.availableProcessors();
        System.out.println(cpuNum);
    }
}
