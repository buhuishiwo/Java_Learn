package com.haishili.spring6.bean;

import java.util.List;
import java.util.Set;

public class Person {
    //注入 List 集合
    private List<String> names;
    //注入 set 集合
    private Set<String> addrs;
    //注入 List 类集合
    private List<Woman> womanList;

    public void setWomanList(List<Woman> womanList) {
        this.womanList = womanList;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", womanList=" + womanList +
                '}';
    }
}
