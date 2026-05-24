import java.util.Scanner;

public class Fascinating {

    public static boolean isFascinating(int n) {

        int[] count = new int[10];

        for (int i = 1; i <= 3; i++) {
            int num = n * i;

            while (num > 0) {
                int digit = num % 10;
                count[digit]++;
                num /= 10;
            }
        }

        if (count[0] > 0) {
            return false;
        }

        for (int i = 1; i <= 9; i++) {
            if (count[i] != 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean result = isFascinating(n);

        System.out.println(result);

    }
}
