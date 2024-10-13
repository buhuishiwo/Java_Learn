package com.haishili.spring6.bean;

import java.util.Arrays;

public class SetArrayDI {
    //set注入数组
    private String[] aiHaos;
    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }

    //set 注入类数组
    private Woman[] womans;
    public void setWomans(Woman[] womans) {
        this.womans = womans;
    }

    @Override
    public String toString() {
        return "SetArrayDI{" +
                "aiHaos=" + Arrays.toString(aiHaos) +
                ", womans=" + Arrays.toString(womans) +
                '}';
    }



}
