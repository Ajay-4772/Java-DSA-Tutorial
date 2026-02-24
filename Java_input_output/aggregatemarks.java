package Java_input_output;
import java.util.Scanner;
public class aggregatemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aggregate=0;
        System.out.println("Enter the subject marks out of 100");
        for(int i=1;i<=5;i++){
            System.out.printf("Subject %d : ",i);
            int marks = sc.nextInt();
            aggregate += marks;
        }
        double percentage=(aggregate/500.0)*100;
        System.out.println("Aggregate: "+aggregate+"/500");
        System.out.println("Percentage: "+percentage+"%");
    }
}
