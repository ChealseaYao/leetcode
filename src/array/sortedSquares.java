package array;

import java.util.Arrays;

public class sortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums1 = sortedSquares(nums);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }


    }

    public static int[] sortedSquares(int[] nums) {
        /* 解法一： 双指针 */
//        int k = nums.length - 1;
//        int[]result = new int[nums.length];
//
//        for (int i = 0, j = nums.length - 1; i <= j; ) {
//            if (nums[i] * nums[i] > nums[j] * nums[j]) {
//                result[k--] = nums[i] * nums[i];
//                i++;
//            } else {
//                result[k--] = nums[j] * nums[j];
//                j--;
//            }
//        }
//        return result;

        /*解法二： 暴力解法*/
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }


}
