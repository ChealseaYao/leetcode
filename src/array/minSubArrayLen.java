package array;

public class minSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));

    }

    public static int minSubArrayLen(int target, int[] nums) {
        /* 解法一： 暴力解法（知道此解法即可，已超时）*/
//        int currentLen = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum = sum + nums[j];
//                if(sum >= target){
//                    currentLen = currentLen > (j -i +1) ? (j - i +1) : currentLen;;
//                    break;
//                }
//            }
//        }
//        if(currentLen == Integer.MAX_VALUE){
//            currentLen = 0;
//        }
//        return currentLen;

        /* 解法二： 滑动窗口*/
        int left = 0;
        int sum = 0;
        int currentLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum >= target) {
                int subL = right - left + 1;
                currentLen = currentLen > subL ? subL : currentLen;
                sum = sum - nums[left++];
            }
        }
        if(currentLen==Integer.MAX_VALUE){
            currentLen = 0;
        }
        return currentLen;

    }
}
