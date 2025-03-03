package array;

import java.util.Arrays;
import java.util.HashMap;

public class findErrorNums {
    public static void main(String[] args) {
        int []nums ={1,2,2,4};
        int[] arr = findErrorNums(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }





    }

    public static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }
        return null;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
