package com.haishili;

public class HomeWork01 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverse(s,1,5));
    }
    public static String reverse(String str, int start, int end) {
        if(start == end) {
            throw new InvalidNumberException("参数错误,传入了相等的值");
        }
        if(start > end) {
            throw new InvalidNumberException("参数错误，起始值大于结束值");
        }
        char[] charArray = str.toCharArray();
        for (int i = start-1, j = end - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}
class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String message) {
        super(message);
    }
}
