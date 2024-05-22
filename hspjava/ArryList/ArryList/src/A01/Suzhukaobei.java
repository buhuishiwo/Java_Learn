package A01;

public class Suzhukaobei {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //clone()方法将开辟一个新空间给新数组。
        int[] arr1 = arr.clone();
        arr1[0] = 2;
        System.out.println(arr[0]);
    }
}
