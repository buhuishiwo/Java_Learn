package com.Game;

import java.util.Random;
import java.util.Scanner;

public class SmallGame {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        String[] choices={"石头","剪刀","布"};
        Tom tom = new Tom();
        tom.isWin(choices,arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}

class Tom{
    public int tomGuess;
    private int comGuess;
    private int winNum = 0;
    private int round = 1;

    Scanner scanner = new Scanner(System.in);

    public void makeGuess(int tomGuess) {
        if(tomGuess > 2 || tomGuess < 0){
            throw new IllegalArgumentException("你的招数必须在 0 和 2 之间");
        } else {
            this.tomGuess = tomGuess;
        }
        Random rand = new Random();
        this.comGuess = rand.nextInt(3);
    }

    public void isWin(String[] choices,String[][] arr) {

        while(round<=3) {
            int j = 0;
            System.out.println("请输入你的出招");
            makeGuess(scanner.nextInt());
            arr[round-1][j] = choices[comGuess];
            arr[round-1][j+1] = choices[tomGuess];
            arr[round-1][j+2] = round+"";
            System.out.println("你选择了" + choices[tomGuess]);
            System.out.println("电脑选择了" + choices[comGuess]);
            if ((tomGuess == 0 && comGuess == 1) || (tomGuess == 2 && comGuess == 0) || (comGuess == 1 && tomGuess == 2)) {
                winNum++;
                System.out.println("你赢了");
            } else if (tomGuess == comGuess) {
                System.out.println("平局");
            } else {
                System.out.println("你输了");
            }
            round++;
        }
        System.out.println("你一共赢了"+winNum+"局");
    }
}