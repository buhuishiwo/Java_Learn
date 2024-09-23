import org.w3c.dom.Node;

public class Jiou {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        MethodA ma = new MethodA();
//        System.out.printf("MethodA方法中");
//        ma.swap(a,b);
//        System.out.println("main方法中 a="+a+" b="+b);
        int[] arr = {1,2,3,4,5};
        MethodB b = new MethodB();
        System.out.printf("Print 方法输出的数组\n");
        b.Print(arr);
        System.out.println("main方法中输出的数组" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class IsJiou{
    public boolean isJiou(int num) {
//        if (num % 2 == 0) {
//            System.out.println(num+"是偶数");
//            return true;
//        }
//        else {
//            System.out.println(num+"是奇数");
//            return false;
//        }
        return num % 2 == 0;
    }

}

class MethodA {
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }
}
class MethodB {
    public void Print(int[] arr)
    {
        arr[0] = 20;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}