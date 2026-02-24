package Java_input_output;

import java.net.SocketOption;
import java.util.Arrays;
import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter the subject marks");
        for(int i=1;i<=5;i++){
            System.out.printf("Subject %d : ",i);
            int marks = sc.nextInt();
            total += marks;
        }
        double percentage = (total/500.0)*100;
        System.out.println(percentage+" %");
    }
}
