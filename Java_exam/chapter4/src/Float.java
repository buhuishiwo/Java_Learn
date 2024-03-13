public class Float {
    public static void main(String[] args) {
        double num1 = .123;
        double num2 = 123.0;
        System.out.printf("%f,%f\n",num1,num2);
        double num3 = 2.7;
        double num4 = 8.1/3.0;  //对运算结果是小数的进行比较时要小心
        System.out.println(num4);
        System.out.println(num3);
        if(Math.abs(num3-num4)<0.000001)
        {
            System.out.println("认为相等");
        }
        System.out.println(Math.abs(num3-num4));
        boolean TF = num3==num4;
        System.out.println(TF);
        int n1 = 10;
        /*
        * 混合类型的数值进行计算，首先将所有数值转换为容量最大的类型
        * 然后在计算，最后在将计算结果转换为定义类型*/
        float n2 = (float) (n1 + 1.1);  //使用强制转换将其转换为 Float 型
        System.out.println(n2);
        short s = 12;
        String s1 = s+"";
        s = (short) (s - 9);    //计算时变成了 int 型
        System.out.println(s1);
    }
}
