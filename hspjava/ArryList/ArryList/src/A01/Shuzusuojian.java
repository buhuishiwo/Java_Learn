package A01;
import java.util.Scanner;
public class Shuzusuojian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        while(true) {
            int[] arr2 = new int[arr1.length-1];
            for(int i = 0; i < arr1.length-1; i++) {
                arr2[i] = arr1[i];
            }
            arr1 = arr2;
            System.out.println("缩减后的数组");
            for(int i = 0;i < arr1.length;i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println("还要缩减吗？");
            char key = sc.next().charAt(0);
            if(key=='n') {
                break;
            }
            if(arr1.length==0) {
                System.out.println("数组长度为 0，不能缩减");
                break;
            }
        }
    }
}
