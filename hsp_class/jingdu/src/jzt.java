import java.util.Scanner;
public class jzt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入层数");
        int cs = input.nextInt();
        for(int i = 1;i <= cs;i++)
        {
            for(int n = cs-i;n>0;n--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= 2*i-1;j++)
            {
                if(j==1||j==2*i-1||i==cs)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
