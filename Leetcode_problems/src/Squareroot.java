import java.util.Scanner;
public class Squareroot {
    static int mySqrt(int x) {
        if(x<2)
            return x;
        double n=x;
        double root;
        while(true){
            root=0.5*(n+x/n);
            if(Math.abs(root-n)<0.0001)
                break;
            n = root;
        }
        return (int)root;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(mySqrt(a));
    }
}
