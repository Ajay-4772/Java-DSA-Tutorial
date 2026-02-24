import java.util.Scanner;
class DayToTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days=sc.nextInt();

        int h=days*24;
        int m=h*60;
        int s=m*60;

        System.out.println("Hours: "+h);
        System.out.println("Minutes: "+m);
        System.out.println("Seconds: "+s);
    }
}
