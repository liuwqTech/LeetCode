package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-22 23:26
 */
public class T35搜索插入位置 {
    public static void main(String[] args) {

    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if (target < nums[middle]){
                right = middle - 1;
            }else if (target > nums[middle]){
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return right + 1;
    }
}
