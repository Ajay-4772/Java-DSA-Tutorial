package Java_input_output;
import java.util.Scanner;
public class Sod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int s=0;
        String S=Integer.toString(n);
        if(S.length()==4) {
            while(n>0){
                int a = n%10;
                s+=a;
                n=Math.floorDiv(n,10);
            }
            System.out.println("Sum of digits: "+s);
        }
        else{
            System.out.println("the entered number is not a four digit number");
        }
    }
}
