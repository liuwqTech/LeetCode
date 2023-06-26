package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-24 20:36
 */
public class T27移除元素 {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int fast, slow = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
