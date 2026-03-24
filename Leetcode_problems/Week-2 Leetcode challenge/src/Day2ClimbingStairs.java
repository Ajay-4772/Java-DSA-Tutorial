import java.util.Scanner;
public class Day2ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res= climbStairs(n);
        System.out.println(res);
    }
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        int a = 1;
        int b = 2;

        for(int i=3;i<=n;i++){
            int sum = a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}
