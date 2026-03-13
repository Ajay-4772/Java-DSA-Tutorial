public class Day5StringtoHexadecimal {
    public static void main(String[] args) {

        int num =26;
        if(num == 0)
            System.out.println("0");

        char[] map = "0123456789abcdef".toCharArray();
        String r ="";
        long n = num;

        if(n < 0){
            n = (1L << 32)+n;
        }
        while(n > 0){
            int rem = (int)(n % 16);
            r = map[rem] + r;
            n = n / 16;
        }
        System.out.println(r);;
    }
}
