import java.util.HashMap;
import java.util.Scanner;

public class FindLuckyInteger {

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int lucky = -1;


        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                lucky = Math.max(lucky, key);
            }
        }

        return lucky;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findLucky(arr));

    }
}