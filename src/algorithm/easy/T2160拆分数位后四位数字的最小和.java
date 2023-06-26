package algorithm.easy;

import java.util.Arrays;

/**
 * @author liuwq
 * @create 2023-05-07 22:37
 */
public class T2160拆分数位后四位数字的最小和 {
    public static void main(String[] args) {
        minimumSum(2932);
    }
    public static int minimumSum(int num) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(array);
        return (10 * array[0] + array[2]) + (10 * array[1] + array[3]);
    }
}
