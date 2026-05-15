import java.util.*;
public class FindtheKBeautyofaNumber {
    public static int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;

        for (int i = 0; i <= s.length() - k; i++) {

            String ss = s.substring(i, i + k);
            int n = Integer.parseInt(ss);
            if (n != 0 && num % n == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(divisorSubstrings(num,k));
    }
}
