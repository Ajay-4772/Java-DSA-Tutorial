package Practice_programs2;
import java.util.Scanner;
import static java.lang.Math.abs;
public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=true;
        int a=n%10;
        n/=10;
        while(n>0){
            int b=n%10;
            if(abs(a-b)!=1){
                f=false;
                break;
            }
            a=b;
            n/=10;
        }
        if(f)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
