package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-24 20:54
 */
public class T26删除有序数组中的重复项 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int fast, slow = 0;
        for (fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]){
                nums[slow + 1] = nums[fast];
                slow++;
            }
        }
        return slow + 1;
    }
}
