package Java_input_output;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth date: ");
        int d = sc.nextInt();
        System.out.print("Enter your birth month: ");
        int m = sc.nextInt();
        System.out.print("Enter your birth year: ");
        int y = sc.nextInt();

        System.out.print("Enter your current date: ");
        int cd = sc.nextInt();
        System.out.print("Enter your current month: ");
        int cm = sc.nextInt();
        System.out.print("Enter your current year: ");
        int cy = sc.nextInt();

        int age = cy-y;

        if(cm<m || (cm==m && cd<d)){
            age-=1;
        }
        System.out.print("Age: "+age);
    }
}
