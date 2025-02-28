package array;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }
    public static void moveZeroes(int[] nums){
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp;
                temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
    }
}
