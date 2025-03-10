package array;

public class generateMatrix {
    public static void main(String[] args) {

    }

    public static int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        int startX = 0;
        int startY = 0;
        int offSet = 1;
        int loop = 1;
        int count = 1;
        int i, j;


        while (loop <= (n / 2)) {
            for (j = startY; j < n - offSet; j++) {
                array[startX][j] = count++;
            }
            for (i = startX; i < n - offSet; i++) {
                array[i][j] = count++;
            }
            for (; j > startY; j--) {
                array[i][j] = count++;
            }
            for (; i > startX; i--) {
                array[i][j] = count++;
            }
            // 更新起始位置和偏移量
            startX++;
            startY++;
            offSet++;
            loop++;
        }
        // 如果 n 是奇数，填充中心元素
        if (n % 2 == 1) {
            array[startX][startY] = count;
        }
        return array;
    }
}
