import java.util.Arrays;
import java.util.Scanner;

public class PrefixCommonArray {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];
        int[] freq = new int[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            freq[A[i]]++;
            if (freq[A[i]] == 2) {
                common++;
            }

            freq[B[i]]++;
            if (freq[B[i]] == 2) {
                common++;
            }
            result[i] = common;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] A = new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }

        int[] B = new int[size];
        for(int i=0;i<size;i++){
            B[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(findThePrefixCommonArray(A,B)));

    }
}
