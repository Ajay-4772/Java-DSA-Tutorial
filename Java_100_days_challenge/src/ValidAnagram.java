import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] arr2 = s.toCharArray();
        char[] arr1 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1,s2));
    }
}
