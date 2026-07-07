import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArrayWithReverse {
    public static int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[2*n-i-1] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(concatWithReverse(arr)));
    }
}
