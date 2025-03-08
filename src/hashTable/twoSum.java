package hashTable;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n), i};
            }
            map.put(nums[i], i);
        }
        return null;


    }

}
