package hashTable;

import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(nums1, nums2);
        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }


    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] arr = new int[result.size()];
        int k = 0;
        for (Integer i : result) {
            arr[k++] = i;

        }
        return arr;

    }
}
