import java.util.Scanner;
public class Day6SingleNumber {

    public static int singleNumber(int[] nums) {
        int a = 0;

        for (int num : nums) {
            a^= num;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber(arr));

    }
}
