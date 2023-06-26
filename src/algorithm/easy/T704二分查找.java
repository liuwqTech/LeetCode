package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-22 23:13
 */
public class T704二分查找 {
    public static void main(String[] args) {

    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right){
            middle = (left + right) / 2;
            if (target < nums[middle]){
                right = middle - 1;
            }else if (target > nums[middle]){
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
