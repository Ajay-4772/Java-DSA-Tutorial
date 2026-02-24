import java.util.Scanner;
public class countOddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ce=0,co=0;
        if(n==0)
             ce=1;
        while(n>0){
            if(((n%10)&1)==0){
                ce++;
            }
            else
                co++;
            n/=10;
        }
        System.out.println("Even Digits: "+ce);
        System.out.println("Odd Digits: "+ce);
    }
}













//        int n = sc.nextInt();
//        int ce=0;
//        int co=0;
//
//        while(n>0){
//            int a=n%10;
//            if(a%2==0)
//                ce+=1;
//            else
//                co+=1;
//            n/=10;
//        }
//        System.out.println("No of Even digits: "+ce);
//        System.out.println("No of Odd digits: "+co);

//        int n = sc.nextInt();
//        String s = n + "";
//        int ce=0;
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(c%2==0){
//                ce+=1;
//            }
//        }
//        System.out.println("No of Even digits: "+ce);
//        System.out.println("No of Even digits: "+(s.length()-ce));

//        int n = sc.nextInt();
//        int co=0,ce=0;
//        while(n>0){
//            if(n%2==0)
//                ce++;
//            else
//                co++;
//            n/=10;
//        }
//        System.out.println("No of Even digits: "+ce);
//        System.out.println("No of Odd digits: "+co);

//int n=sc.nextInt();
//        int co=0, ce=0;
//        while(n>0){
//int a = (n%2==0)?ce++:co++;
//n/=10;
//        }
//        System.out.println("Even Digits: "+ce);
//        System.out.println("Even Digits: "+co);