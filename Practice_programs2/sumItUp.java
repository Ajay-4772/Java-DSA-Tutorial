package Practice_programs2;
import java.util.Scanner;
public class sumItUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if (num==0)
            System.out.println(0);
        System.out.println(1+(num-1)%9);

    }
}
