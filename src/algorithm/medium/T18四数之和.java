package algorithm.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuwq
 * @create 2023-06-28-14:16
 */
public class T18四数之和 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // a = nums[k], b = nums[i], c = nums[left], d = nums[right]
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0 && nums[k] > target) return result; // 剪枝
            if (k > 0 && nums[k] == nums[k-1]) continue; // 对nums[k]去重
            for (int i = k + 1; i < nums.length; i++) {
                if (i > k + 1 && nums[i] == nums[i-1]) continue; // 对nums[i]去重
                int left = i + 1;
                int right = nums.length - 1;
                // nums[k] + nums[i] + nums[left] + nums[right] > target （int会溢出）
                while (left < right){
                    long sum = nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum > target) right--;
                    else if (sum < target) left++;
                    else {
                        result.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        // 对nums[left]和nums[right]去重
                        while (left < right && nums[right] == nums[right-1]) right--;
                        while (left < right && nums[left] == nums[left+1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
