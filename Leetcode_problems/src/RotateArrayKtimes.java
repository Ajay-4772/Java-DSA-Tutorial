import java.util.Arrays;

public class RotateArrayKtimes {
    public static void main(String[] args) {
        int K =2;
        int[] a={10,20,30,40,50,60,70};
        Reverse(a,0,K);
        Reverse(a,K+1,a.length-1);

        System.out.println(Arrays.toString(a));
    }
    public static void Reverse(int a[] , int start , int end){
        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}

