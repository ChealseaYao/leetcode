package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {


    }

    public static List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> listArrayList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return listArrayList;
            }
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    listArrayList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (right > left && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    right--;
                    left++;
                }
            }


        }
        return listArrayList;

    }

}
