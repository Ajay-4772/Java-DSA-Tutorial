public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m;

        for (int i = 0; i < n; i++) {
            int val = nums2[i];
            int j = len - 1;
            while (j >= 0 && nums1[j] > val) {
                nums1[j + 1] = nums1[j];
                j--;
            }
            nums1[j + 1] = val;
            len++;
        }
    }

    public static void main(String[] args) {
        int[] ar1 = {1,2,3,0,0,0};
        int[] ar2 = {4,5,6};
        int m = ar1.length;
        int n = ar2.length;
        merge(ar1,m,ar2,n);
    }
}