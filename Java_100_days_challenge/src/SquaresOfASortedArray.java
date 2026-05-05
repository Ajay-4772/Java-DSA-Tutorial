//977. Squares of a Sorted Array
//        Solved
//        Easy
//        Topics
//        premium lock icon
//        Companies
//        Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//        Example 1:
//
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
//        Example 2:
//
//        Input: nums = [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//        nums is sorted in non-decreasing order.




import java.util.Scanner;
import java.util.Arrays;

class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int l = 0, r = n-1;
        int k = n-1;

        while (l <= r){
            int left = nums[l]*nums[l];
            int right = nums[r]*nums[r];

            if (left > right){
                res[k--] = left;
                l++;
            } else{
                res[k--] = right;
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sortedSquares(array)));
    }
}
