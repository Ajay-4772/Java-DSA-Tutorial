import java.util.Scanner;
public class ComplementOfBase10Integer {
    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;
        String binary = Integer.toBinaryString(n);
        String s = "";
        int b = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1')
                s += "0";
            else
                s += "1";
        }
        b = Integer.parseInt(s, 2);
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bitwiseComplement(n));
    }
}
