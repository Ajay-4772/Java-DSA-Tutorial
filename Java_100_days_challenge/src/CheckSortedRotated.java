import java.util.Scanner;

public class CheckSortedRotated {

    public static boolean isSortedAndRotated(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (isSortedAndRotated(nums)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}