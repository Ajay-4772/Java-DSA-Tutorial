package Java_input_output;
import java.util.Scanner;
public class Currencyw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of 100s: ");
        int h = sc.nextInt();
        System.out.print("Enter the number of 500s: ");
        int fh = sc.nextInt();
        System.out.print("Enter the number of 1000s: ");
        int t = sc.nextInt();

        int total = (h*100)+(fh*500)+(t*1000);

        System.out.print("Total Withdrawn amount: "+total);
    }
}
