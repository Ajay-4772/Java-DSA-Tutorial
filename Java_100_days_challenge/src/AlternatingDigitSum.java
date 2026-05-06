import java.util.Scanner;
public class AlternatingDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = alternateDigitSum(n);
        System.out.println(ans);
    }

    public static int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int k=0;
        int sum=0;
        for(char c : num.toCharArray()){
            if(k%2==0)
                sum+=c-'0';
            else
                sum-=c-'0';
            k++;
        }
        return sum;
    }
}
