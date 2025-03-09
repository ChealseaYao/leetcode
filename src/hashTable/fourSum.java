package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] >= 0 && nums[k] > target) break;

            if (k > 0 && nums[k] == nums[k - 1]) continue;

            for (int i = k + 1; i < nums.length; i++) {
                if (nums[k] + nums[i] >= 0 && nums[k] + nums[i] > target)
                    break;//这里应该是break返回到上层循环，而不是return result
                if (i > k + 1 && nums[i] == nums[i - 1]) continue;

                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    if (nums[k] + nums[i] + nums[left] + nums[right] > target) {
                        right--;
                    } else if (nums[k] + nums[i] + nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        list.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        while (right > left && nums[left + 1] == nums[left]) left++;
                        while (right > left && nums[right - 1] == nums[right]) right--;
                        left++;
                        right--;
                    }
                }
            }
        }
        return list;

    }

}
