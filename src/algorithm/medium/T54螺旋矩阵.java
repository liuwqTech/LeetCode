package algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuwq
 * @create 2023-04-27 21:19
 */
public class T54螺旋矩阵 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = spiralOrder(test);
        System.out.println(list);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int hang = matrix.length; //行
        int lie = matrix[0].length; //列
        int startX = 0;
        int startY = 0;
        int mid = Math.min(hang,lie);
        int i,j;
        int offset = 1;
        int loop = 0;
        List<Integer> list = new ArrayList<>();
        while (loop++ < mid / 2){
            i = startX;
            j = startY;
            for (j = startY; j < lie - offset; j++) {
                list.add(matrix[startX][j]);
            }
            for (i = startX; i < hang - offset; i++) {
                list.add(matrix[i][j]);
            }
            for (; j > startY; j--) {
                list.add(matrix[i][j]);
            }
            for (; i > startX; i--) {
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
                for (; j <= lie - offset; j++) {
                    list.add(matrix[startX][j]);
                }
            }else {
                for (; i <= hang - offset; i++) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
