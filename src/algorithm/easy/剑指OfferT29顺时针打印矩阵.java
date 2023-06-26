package algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuwq
 * @create 2023-04-27 23:11
 */
public class 剑指OfferT29顺时针打印矩阵 {
    public static void main(String[] args) {

    }
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null) return new int[]{};
        int hang = matrix.length;
        if(hang == 0) return new int[0];
        int lie = matrix[0].length;
        int startX = 0;
        int startY = 0;
        int mid = Math.min(hang,lie);
        int loop = 0;
        int i,j;
        int offset = 1;
        List<Integer> list = new ArrayList<>();
        int[] nums = new int[hang * lie];
        while (loop++ < mid / 2){
            i = startX;
            j = startY;
            for (j = startY; j < lie - offset; j++) {
                list.add(matrix[startX][j]);
            }
            for (i = startX; i < hang - offset; i++) {
                list.add(matrix[i][j]);
            }
            for ( ; j > startY; j--) {
                list.add(matrix[i][j]);
            }
            for ( ; i > startX; i--) {
                list.add(matrix[i][j]);
            }
            startX++;
            startY++;
            offset++;
        }
        if (mid % 2 == 1){
            i = startX;
            j = startY;
            if (mid == hang){
                for ( ; j <= lie - offset; j++) {
                    list.add(matrix[startX][j]);
                }
            }else {
                for ( ; i <= hang - offset; i++) {
                    list.add(matrix[i][j]);
                }
            }
        }
        for (int k = 0; k < list.size(); k++) {
            nums[k] = list.get(k);
        }
        return nums;
    }
}
