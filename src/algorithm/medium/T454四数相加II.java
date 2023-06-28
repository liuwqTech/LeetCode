package algorithm.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuwq
 * @create 2023-06-27-18:03
 */
public class T454四数相加II {
    public static void main(String[] args) {

    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // 统计两个数组中的元素之和，同时统计出现的次数，放入map
        for (int num1 : nums1){
            for (int num2 : nums2){
                int sum = num1 + num2;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        // 统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数
        for (int num3 : nums3){
            for (int num4 : nums4){
                result += map.getOrDefault(-(num3 + num4), 0);
            }
        }
        return result;
    }
}
