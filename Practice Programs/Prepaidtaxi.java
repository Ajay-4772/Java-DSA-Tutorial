import java.util.Scanner;
class PrepaidTaxi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Taxi Number: ");
        String taxiNo = sc.nextLine();
        System.out.print("Enter distance travelled: ");
        int d = sc.nextInt();
        int amount;

        if(d<=5){
            amount=100;
        } else if(d<=15){
            amount=100+(d-5)*10;
        } else if(d<=25){
            amount=100+10*10+(d-15)*8;
        } else{
            amount=100+10*10+10*8+(d-25)*5;
        }
        System.out.println("Taxi No: "+taxiNo);
        System.out.println("Distance covered: "+d);
        System.out.println("Amount: "+amount);
    }
}
