public class QueneofDeath {
    public static void main(String[] args) {
        int[] queens = new int[8];
        queens[0] = 0;
        Queen queen = new Queen();
        queen.solve(queens,1);
    }
}

class Queen {
    public void solve(int[] queens, int row) {
        if (row == queens.length) {
            print(queens);
        }else {
            for(int col = 0;col < queens.length;col++){
                if(isSafe(queens,row,col)) {
                    queens[row] = col;
                    solve(queens,row+1);
                }
            }
        }
    }

    public boolean isSafe(int[] queens,int row,int col) {
        for(int prevRow=0;prevRow<row;prevRow++){
            int prevCol = queens[prevRow];
            //判断是否处在同一列
            if(queens[prevRow]==col){
                return false;
            }
            //判断是否处在同一对角线
            if(Math.abs(prevCol - col) == Math.abs(prevRow - row))
            {
                return false;
            }
        }
        return true;
    }

    public void print(int[] queens) {
        for (int row = 0; row < queens.length; row++) {
            for (int col = 0; col < queens.length; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
