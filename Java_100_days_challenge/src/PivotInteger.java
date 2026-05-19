import java.util.Scanner;
public class PivotInteger {
    public static int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;

        int x = (int)Math.sqrt(totalSum);

        return x * x == totalSum ? x : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pivotInteger(n));
    }
}
