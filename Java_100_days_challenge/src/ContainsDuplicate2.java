import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);

                if (i - prevIndex <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println(result);

        sc.close();
    }
}