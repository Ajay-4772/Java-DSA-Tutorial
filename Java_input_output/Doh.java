package Java_input_output;
 import java.util.Scanner;
public class Doh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.printf("decimal: %d \n",n);
        System.out.printf("Octal: %o \n",n);
        System.out.printf("Hexadecimal: %h \n",n);
    }
}
