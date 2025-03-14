package maxPalindromenumber;
import java.util.Scanner;

public class MaxPalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Palindrome p = new Palindrome();
        System.out.println("Number:"+num+" is palindrome:"+p.isPalindrome(num));
    }
}

class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != x)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}