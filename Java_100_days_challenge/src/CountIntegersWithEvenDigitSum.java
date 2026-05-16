import java.util.*;
public class CountIntegersWithEvenDigitSum {
        public static int countEven(int num) {
            int count=0;
            for(int i=1;i<=num;i++){
                int sum=digitSum(i);
                if(sum%2==0)
                    count++;
            }
            return count;
        }
        public static int digitSum(int n){
            int sum=0;

            while(n>0){
                sum +=n%10;
                n/=10;
            }
            return sum;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countEven(num));
    }
}

