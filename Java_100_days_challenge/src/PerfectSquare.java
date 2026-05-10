import java.util.Scanner;

public class PerfectSquare {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++){
            dp[i] = i;

            for (int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i], 1 + dp[i-j*j]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numSquares(num));
    }
}
