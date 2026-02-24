import java.util.Scanner;

class MSB{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n>=10){
            n/=10;
        }
        System.out.println(n);
    }
}

