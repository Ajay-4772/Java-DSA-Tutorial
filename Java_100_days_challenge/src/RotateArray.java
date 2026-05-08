import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] nums={1,2,3,4,5,6,7};
        int n = nums.length;
        k = k % n;
        Reverse(nums,0,n-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }
    public static void Reverse(int a[] , int start , int end){
        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
