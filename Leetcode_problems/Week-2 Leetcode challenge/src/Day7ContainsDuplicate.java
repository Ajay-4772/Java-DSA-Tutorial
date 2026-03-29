import java.util.HashSet;
import java.util.Scanner;

public class Day7ContainsDuplicate{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int a : nums){
            if(!s.add(a))
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean res = containsDuplicate(arr);
        System.out.println(res);
    }
}
