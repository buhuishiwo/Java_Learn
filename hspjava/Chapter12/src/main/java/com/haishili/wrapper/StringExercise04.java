package com.haishili.wrapper;

public class StringExercise04 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        //这里传入的 test1.str其实是一个副本，change 中的 str 只是也指向了 test1中 str 的空间，
        //当方法中str 的值发生改变时，只是 str 指向了一个新的 String 空间，因为字符串有不可变性，不能改变 String 的值，改变的只是引用的空间，
        //比如 String s1 = "java";s1 = "hello"
        //这里的s1只是一个一开始指向"java"这个值的引用，我们无法更改"java"这个值，在s1 = "hello"中
        //我们只是更改了 s1指向的空间，即将s1指向了"hello"这个值的空间
        test1.change(test1.str, test1.ch);
        System.out.println(test1.str+"and");
        System.out.println(test1.ch);
    }
}
class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
}