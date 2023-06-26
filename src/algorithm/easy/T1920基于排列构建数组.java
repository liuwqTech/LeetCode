package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-26 09:37
 */
public class T1920基于排列构建数组 {
    public static void main(String[] args) {

    }
    public int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]];
        }
        return array;
    }
}
