import java.util.Scanner;

public class Day3ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0)
            System.out.println(0);
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        if((int)x==num)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
