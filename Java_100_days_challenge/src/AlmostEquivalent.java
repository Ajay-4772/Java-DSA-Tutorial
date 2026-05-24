import java.util.Scanner;
public class AlmostEquivalent {
    public static boolean checkAlmostEquivalent(String word1, String word2) {

        int[] count = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(count[i]) > 3) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        boolean result = checkAlmostEquivalent(word1, word2);

        System.out.println(result);

    }
}