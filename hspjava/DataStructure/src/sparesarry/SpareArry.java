package sparesarry;

import java.sql.Array;

public class SpareArry {
    public static void main(String[] args) {
        int array1[][] = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        int sum = 0;

        for(int[] row : array1)
        {
            for(int data : row)
            {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j] != 0){
                    sum++;
                }
            }
        }
        int array2[][] = new int[3][sum+1];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j] != 0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        System.out.println(sum);
        for(int []row1 : array2){
            for(int data : row1){
                System.out.printf("%d\t", data);
            }

            System.out.println();
        }
    }
}
