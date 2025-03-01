package array;

import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {

    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minHeap.offer(matrix[i][j]);
            }

        }
        for (int i = 0; i < k-1; i++) {
            minHeap.poll();
        }
         return minHeap.poll();

    }
}
