package com.haishili.bigdata;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1234567891234567890");
        System.out.println(bigInteger);
        //加 1
        System.out.println(bigInteger.add(BigInteger.ONE));
        //减 1
        System.out.println(bigInteger.subtract(BigInteger.ONE));
        //乘 2
        System.out.println(bigInteger.multiply(BigInteger.TWO));
        //取余
        System.out.println(bigInteger.mod(BigInteger.TEN));

        //高精度浮点数
        BigDecimal bigDecimal = new BigDecimal("1.31451353513");
        System.out.println(bigDecimal);
    }
}
