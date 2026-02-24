import java.util.Scanner;
class steel{
    static String classifyGivenSteel(int h,float c,int ts){
        boolean c1=h>60;
        boolean c2=c>0.8;
        boolean c3=ts>5700;

        if(c1 && c2 && c3) return "Class A";
        if(c1 && c2) return "Class B";
        if(c1 && c3) return "Class C";
        if(c2 && c3) return "Class D";
        if(c1 || c2 || c3) return "Class E";

        return "Class F";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("h: ");
        int h=sc.nextInt();
        System.out.println("c: ");
        float c=sc.nextFloat();
        System.out.println("ts: ");
        int ts=sc.nextInt();

        System.out.println(classifyGivenSteel(h,c,ts));
    }
}
