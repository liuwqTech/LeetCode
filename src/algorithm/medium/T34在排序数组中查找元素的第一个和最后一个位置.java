package algorithm.medium;

/**
 * @author liuwq
 * @create 2023-04-23 11:35
 */
public class T34在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {

    }
    public static int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums,target);
        int rightBorder = getRightBorder(nums,target);
        if (leftBorder == -2 || rightBorder == -2){
            return new int[]{-1,-1};
        }
        if (rightBorder - leftBorder > 1){
            return new int[]{leftBorder + 1, rightBorder - 1};
        }
        return new int[]{-1,-1};
    }
    //寻找右边界
    static int getRightBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;
        while (left <= right){
            int middle = (left + right) / 2;
            if (target < nums[middle]){
                right = middle - 1;
            }else {
                left = middle + 1;
                rightBorder = left;
            }
        }
        return  rightBorder;
    }
    //寻找左边界
    static int getLeftBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right){
            int middle = (left + right) / 2;
            if (target <= nums[middle]){
                right = middle - 1;
                leftBorder = right;
            }else {
                left = middle + 1;
            }
        }
        return  leftBorder;
    }
}
