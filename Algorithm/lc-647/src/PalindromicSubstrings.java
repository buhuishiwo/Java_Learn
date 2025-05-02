/**
 * @author haishili
 * @date 2025/5/2
 */
public class PalindromicSubstrings {
    public static void main(String[] args) {
        String input = "abcba";
        int i = countSubstrings(input);
        System.out.println(i);
    }
    public static int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = chars.length - 1; i >= 0; i--) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    if (j - i <= 1) {
                        count++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        count++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return count;
    }
}
