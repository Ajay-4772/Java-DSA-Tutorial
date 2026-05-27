import java.util.Scanner;

public class CountSpecialCharacters2 {

    public static int numberOfSpecialChars(String word) {

        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        for (int i = 0; i < 26; i++) {
            lastLower[i] = -1;
            firstUpper[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lastLower[ch - 'a'] = i;
            } else {
                int index = ch - 'A';

                if (firstUpper[index] == -1) {
                    firstUpper[index] = i;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 &&
                    firstUpper[i] != -1 &&
                    lastLower[i] < firstUpper[i]) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int result = numberOfSpecialChars(word);

        System.out.println(result);
    }
}