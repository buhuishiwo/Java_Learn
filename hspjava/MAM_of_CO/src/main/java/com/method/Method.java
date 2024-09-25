package com.method;

public class Method {
    public static void main(String[] args) {
        int [][] map = {{0,0,0},{1,1,1,},{2,2,2}};
        MyTools myTools = new MyTools();
        myTools.printArr(map);
    }
}
class MyTools {
    public void printArr(int[][] arr)
    {
        for(int i = 0 ;i < arr.length;i++)
        {
            for(int j = 0 ;j < arr[i].length;j++)
            {
                System.out.print("第"+i+"行,"+"第"+j+"个:"+arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
