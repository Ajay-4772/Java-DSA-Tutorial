import java.util.Scanner;

class DiffBetweenSums{
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int differenceOfSum(int[] nums) {
        int elementsum=0;
        for(int a : nums){
            elementsum+=a;
        }
        int digitsum=0;
        for(int b : nums){
            if(b>9){
                digitsum+=digitSum(b);
            }
            else{
                digitsum+=b;

            }
        }
        return Math.abs(digitsum-elementsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(differenceOfSum(arr));
    }
}