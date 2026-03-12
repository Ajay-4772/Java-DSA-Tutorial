public class Day4AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        String res = "";

        while (i >= 0 || j >= 0 || carry != 0) {

            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                b = num2.charAt(j) - '0';
                j--;
            }

            int sum = a + b + carry;

            res = (sum % 10) + res;
            carry = sum / 10;
        }

        System.out.println(res);
    }
}
