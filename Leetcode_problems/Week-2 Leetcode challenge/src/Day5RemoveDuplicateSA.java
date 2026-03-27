import java.util.Scanner;

public class Day5RemoveDuplicateSA {
    public static int removeDuplicates(int[] nums) {
        int s = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[s]){
                s++;
                nums[s] = nums[i];
            }
        }
        return s+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int res = removeDuplicates(arr);
        System.out.println(res);

    }
}
