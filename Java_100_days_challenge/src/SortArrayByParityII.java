import java.util.Scanner;

public class SortArrayByParityII {

    public  int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        SortArrayByParityII obj = new SortArrayByParityII();
        int[] ans = obj.sortArrayByParity(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}