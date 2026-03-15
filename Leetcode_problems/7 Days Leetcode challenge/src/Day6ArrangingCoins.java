import java.util.Scanner;
public class Day6ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;

        while(n >= row){
            n = n - row;
            row++;
        }

        System.out.println(row - 1);

    }
}
