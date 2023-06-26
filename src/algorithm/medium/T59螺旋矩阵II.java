package algorithm.medium;

/**
 * @author liuwq
 * @create 2023-04-27 20:26
 */
public class T59螺旋矩阵II {
    public static void main(String[] args) {

    }
    public static int[][] generateMatrix(int n) {
        int loop = 0;
        int mid = n / 2;
        int startX = 0, startY = 0;
        int offset = 1;
        int[][] nums = new int[n][n];
        int count = 1;
        int i, j;
        while (loop++ < n / 2){
            i = startX;
            j = startY;
            for (j = startY; j < n - offset; j++){
                nums[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                nums[i][j] = count++;
            }
            for (; j > startY; j--) {
                nums[i][j] = count++;
            }
            for (; i > startX; i--) {
                nums[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
        }
        if (n % 2 == 1){
            nums[mid][mid] = count;
        }
        return nums;
    }
}
