package array;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(search(nums, 5));

    }

    public static int search(int[] nums, int target) {
        /* 解法一:区间为左闭右开 */
//        int left = 0;
//        int right = nums.length;
//
//        while (left < right) {
//            int middle = left + (right - left) / 2; //middle为下标
//            if(nums[middle] < target){
//                left = middle + 1;
//            }else if(nums[middle] > target){
//                right = middle;
//            }else {
//                return middle;
//            }
//        }
//        return -1;

        /* 解法二:区间为左闭右闭 */
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            }else {
                return middle;
            }

        }
        return -1;


    }

}
