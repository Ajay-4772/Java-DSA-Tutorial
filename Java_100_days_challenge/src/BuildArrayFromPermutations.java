import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutations {
    public static  int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
