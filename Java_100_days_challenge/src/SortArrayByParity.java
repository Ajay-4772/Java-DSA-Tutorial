import java.util.Arrays;
import java.util.Scanner;
class SortArrayByParity {
    public static int[] Solution(int[] nums) {
        if(nums.length==1)
            return nums;
        int f=0;
        int l=nums.length-1;
        while(f<l){
            if((nums[f] & 1)==0)
                f++;
            else if((nums[l] & 1)==1)
                l--;
            else{
                int temp = nums[f];
                nums[f] = nums[l];
                nums[l] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res = Solution(arr);
        System.out.println(Arrays.toString(res));
    }
}