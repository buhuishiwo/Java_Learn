package A01;

public class Shuzufuzhi {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = arr1;
        arr2[0] = 5;
        //引用赋值，当对应地址的值发生改变，所有引用了这个地址的变量值都会改变
        System.out.println(arr1[0]);    //5

    }
}
