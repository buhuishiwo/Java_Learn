package A01;
import java.util.Scanner;

public class Shuzutianjia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = {1,2,3};
        do{
            int[] arr2 = new int[arr1.length+1];
            for(int i=0;i<arr1.length;i++){
                arr2[i]=arr1[i];
            }
            int addNum = in.nextInt();
            arr2[arr2.length-1] = addNum;
            arr1=arr2;
            System.out.println("~~~~~扩容后的数组~~~~~");
            for(int i=0;i<arr2.length;i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
            System.out.println("还要继续扩容吗？");
            char key = in.next().charAt(0);
            if(key=='n'){
                break;
            }
        }while(true);
    }
}
