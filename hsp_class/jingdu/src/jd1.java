import java.util.Scanner;
public class jd1 {
    public static void main(String[] args) {
        int d = (int)1.2;
        String s1 = 124+"";
        System.out.println(s1);
        int n1 = Integer.parseInt("123");   //转为 int 型
        double n2 = Double.parseDouble("1234");     //转为 double 型
        float n3 = Float.parseFloat("1245");    //转为 float 型

        Scanner input = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = input.next();
        int age = input.nextInt();  //输入 int
        double sal = input.nextDouble();    //输入 double
        System.out.println("姓名:"+name+"年龄:"+age+"薪水:"+sal);

    }
}
