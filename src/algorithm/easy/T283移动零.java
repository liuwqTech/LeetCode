package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-24 21:14
 */
public class T283移动零 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int fast, slow = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
