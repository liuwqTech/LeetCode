package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-24 22:04
 */
public class T977有序数组的平方 {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {
        int[] resultArray = new int[nums.length];
        int r = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]){
                resultArray[r--] = nums[i] * nums[i];
                i++;
            }else {
                resultArray[r--] = nums[j] * nums[j];
                j--;
            }
        }
        return resultArray;
    }
}
