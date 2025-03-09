package hashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class fourSumCount {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));


    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                if (hm.containsKey(sum)) {
                    int n = hm.get(sum);
                    n = n + 1;
                    hm.put(sum, n);
                } else {
                    hm.put(sum, 1);
                }
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum = nums3[i] + nums4[j];
                if (hm.containsKey(0 - sum)) {
                    count = count + hm.get(0 - sum);
                }
            }
        }
        return count;


    }

}
