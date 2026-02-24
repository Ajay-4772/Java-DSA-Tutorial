package Java_input_output;
import java.util.Scanner;
public class gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mrp of the product: ");
        float mrp= sc.nextFloat();
        float cgst = mrp*0.09f ;
        float sgst = mrp*0.09f;
        float price = mrp+cgst+sgst;
        System.out.println("MRP : "+mrp);
        System.out.println("CGST : "+cgst);
        System.out.println("SGST : "+sgst);
        System.out.printf("Price : %.2f",price);
    }
}
