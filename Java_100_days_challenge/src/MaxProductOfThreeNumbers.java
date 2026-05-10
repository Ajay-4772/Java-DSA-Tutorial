//628. Maximum Product of Three Numbers
//        Solved
//        Easy
//        Topics
//        premium lock icon
//        Companies
//        Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3]
//        Output: 6
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//        Output: 24
//        Example 3:
//
//        Input: nums = [-1,-2,-3]
//        Output: -6
//
//
//        Constraints:
//
//        3 <= nums.length <= 104
//        -1000 <= nums[i] <= 1000



import java.util.Scanner;

public class MaxProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num:nums){
            if(num>max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num>max2){
                max3 = max2;
                max2 = num;
            }
            else if(num>max3){
                max3 = num;
            }
            if(num<min1){
                min2 = min1;
                min1 = num;
            }
            else if(num<min2){
                min2 = num;
            }
        }
        int p1 = max1*max2*max3;
        int p2 = min1*min2*max1;

        return Math.max(p1,p2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maximumProduct(arr));
    }
}
