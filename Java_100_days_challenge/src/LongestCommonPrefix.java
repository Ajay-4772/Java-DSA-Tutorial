import java.util.HashSet;
import java.util.Scanner;
public class LongestCommonPrefix {
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            while (num > 0) {
                set.add(num);
                num /= 10;
            }
        }

        int maxLength = 0;

        for (int num : arr2) {
            int temp = num;

            while (temp > 0) {
                if (set.contains(temp)) {
                    maxLength = Math.max(maxLength, String.valueOf(temp).length());
                    break;
                }
                temp /= 10;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(longestCommonPrefix(arr1,arr2));

    }
}
