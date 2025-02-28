package array;

public class matrixReshape {
    public static void main(String[] args) {


    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        /** 解法一**/
        /*
        int rows = mat.length;
        int cols = mat[0].length;
        int nums = rows * cols;

        if (nums != r * c) {
            return mat;
        }

        int[] arr = new int[nums];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[k++] = mat[i][j];
            }
        }

        int m = 0;
        int[][] newMat = new int[r][c];
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
                newMat[i][j] = arr[m++];
            }
        }
        return newMat;
        */

        /**解法二**/
        int rows = mat.length;
        int cols = mat[0].length;
        int nums = rows * cols;

        if (nums != r * c) {
            return mat;
        }

        int[][] newMat = new int[r][c];
        int newR = 0;
        int newC = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newMat[newR][newC] = mat[i][j];
                newC++;
                if(newC == c){
                    newC = 0;
                    newR++;
                }
            }
        }
        return newMat;
    }
}
