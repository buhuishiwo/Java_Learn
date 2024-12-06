package com.haishili.customGeneric;

public class CustomGeneric {
    public static void main(String[] args) {
        Boss<Object, Object, Object> john = new Boss<>("john");
    }
}


class Boss<T,R,M> {
    String name;
    T t;
    R r;
    M m;

    //泛型数组不能初始化
//    T[] ts = new T[8];
    public Boss(String name) {
        this.name = name;
    }

    public Boss(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
