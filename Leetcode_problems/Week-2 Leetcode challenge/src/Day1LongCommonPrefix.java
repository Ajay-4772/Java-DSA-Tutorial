
public class Day1LongCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower" , "flow" , "flight"};
        String[] arr2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestCommonPrefix(arr2));

    }
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        for(int i=0;i<strs[0].length();i++){
            char a = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i>=strs[j].length() || strs[j].charAt(i) != a) {
                    return s;
                }
            }
            s+=a;
        }
        return s;
    }
}