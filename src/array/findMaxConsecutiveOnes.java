package array;

import java.util.ArrayList;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        /** 解法1 **/
        /*int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            while (i < nums.length && nums[i] == 1) {
                count++;
                i = i + 1;
            }
            arr.add(count);
            count = 0;
        }

        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;*/

        /**解法2**/

        int current = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                current++;
                max = Math.max(current,max);
            }else {
                current = 0;
            }
        }
        return max;


    }
}
