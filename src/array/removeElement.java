package array;

public class removeElement {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        /* 解法一： 快慢指针 */
//        int slow = 0;
//        for (int fast = 0; fast < nums.length; fast++) {
//            if (nums[fast] != val) {
//                nums[slow] = nums[fast];
//                slow++;
//            }
//        }
//        return slow;

        /*解法二： 暴力解法*/
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }
}
