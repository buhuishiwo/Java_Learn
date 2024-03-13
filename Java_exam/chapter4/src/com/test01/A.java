package com.test01;

class B{
    int n=1;
    static float x;
    class P{
        int n=100;
        static float b = 2.1f;
    }
    private void B(){
        System.out.println(0);
    }
    static int sum = 0;
    void setN(int n)
    {
        this.n=n;
    }
    int getSum(){
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}
public class A {
    public static void main(String[] args) {
        B b1 = new B(),b2 = new B();
        b1.setN(3);
        b2.setN(5);
        int s1 = b1.getSum();   //s1=6
        int s2 = b2.getSum();   //s2=21
        System.out.println(s1+s2);

    }
}
