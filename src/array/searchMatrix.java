package array;

public class searchMatrix {
    public static void main(String[] args) {

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (matrix == null || m == 0 || n == 0) {
            return false;
        }

        int i = 0;
        int j = n - 1;


        while (i < m && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            } else if (target > matrix[i][j]) {
                i++;
            }

        }
        return false;


    }

}
