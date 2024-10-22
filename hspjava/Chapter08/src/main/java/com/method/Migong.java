package com.method;

public class Migong  {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for(int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for(int i = 1; i < 7; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        Method_ method = new Method_();
        method.findway(map,1,1);
        System.out.println("======寻找道路后的数组======");
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Method_ {
    public boolean findway(int[][] map, int X, int Y) {
        if(map[5][1] == 2) {
            return true;
        }else {
            if(map[X][Y] == 0) {
                map[X][Y] = 2;
                if(findway(map, X , Y + 1)) {
                    return true;
                }
                if(findway(map, X + 1, Y )) {
                    return true;
                }
                if(findway(map, X , Y - 1)) {
                    return true;
                }
                if(findway(map, X  - 1 ,Y )) {
                    return true;
                }
                else {
                    map[X][Y] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}