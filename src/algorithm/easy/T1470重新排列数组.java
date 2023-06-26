package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-05-05 23:08
 */
public class T1470重新排列数组 {
    public static void main(String[] args) {

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
