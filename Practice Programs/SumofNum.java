import java.util.Scanner;

class SumofNum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();

        int sum = (N*(N+1)/2)-((M-1)*M/2);
        System.out.println(sum);
    }
}
