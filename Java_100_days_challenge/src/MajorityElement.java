import java.util.*;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Map.put(nums[i],Map.getOrDefault(nums[i],0)+1);
        }
        int maxvalue=0;
        int maxkey=0;
        for(Map.Entry<Integer,Integer> m : Map.entrySet()){
            int value = m.getValue();
            if(value>maxvalue){
                maxvalue=value;
                maxkey=m.getKey();
            }
        }
        return maxkey;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}
