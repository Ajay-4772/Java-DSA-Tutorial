import java.util.Scanner;
public class Day4SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res = searchInsert(nums,target);
        System.out.println(res);
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
