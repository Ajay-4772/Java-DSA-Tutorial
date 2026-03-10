public class Day2_MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        int eSum = n * (n + 1) / 2;
        int aSum = 0;

        for(int num : nums){
            aSum += num;
        }

        System.out.println(eSum - aSum);
    }
}
//OUTPUT: 8