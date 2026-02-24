import java.util.Scanner;
public class Ascnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f=true;
        while(n>0){
            if (n % 10 < ((n / 10) % 10))
                f = false;
            n/=10;
        }
        System.out.println((f)?"true":"false");
    }
}
