package stackAndqueue;

import java.util.*;

public class maxSlidingWindow {
    public static void main(String[] args) {

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // 根据题意，i为nums下标，是要在[i - k + 1, i] 中选到最大值，只需要保证两点
            // 1.队列头结点需要在[i - k + 1, i]范围内，不符合则要弹出
            if (deque.size() != 0 && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // 2.维护单调递减队列：新元素若大于队尾元素，则弹出队尾元素，直到满足单调性
            while (deque.size() != 0 && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            //因为单调，当i增长到符合第一个k范围的时候，每滑动一步都将队列头节点放入结果就行了,当i=k-1时是第一个窗口形成，i每移动一次，重新放入result。
            if (i >= k - 1) {
                result[count++] = nums[deque.peekFirst()];
            }
        }
        return result;


    }


}
