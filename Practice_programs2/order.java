package Practice_programs2;
import java.util.Scanner;
public class order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean as=true;
        boolean ds=true;
        int a=n%10;
        n/=10;
        while(n>0){
            int b=n%10;
            if(a<b)
                as=false;
            if(a>b)
                ds=false;
            a=b;
            n/=10;
        }
        if(as)
            System.out.println("Ascending");
        else if(ds)
            System.out.println("Descending");
        else
            System.out.println("Not in order");
    }
}
