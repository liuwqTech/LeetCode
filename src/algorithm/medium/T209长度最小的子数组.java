package algorithm.medium;

/**
 * @author liuwq
 * @create 2023-04-25 21:15
 */
public class T209长度最小的子数组 {
    public static void main(String[] args) {

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;
        int subLength;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target){
                subLength = j - i + 1;
                result = Math.min(result, subLength);
                sum -= nums[i];
                i++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
