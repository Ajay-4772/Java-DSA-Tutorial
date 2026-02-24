import java.util.Scanner;
class Fraction{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        System.out.printf("%.4f",(a+b)-(int)(a+b));
    }
}

