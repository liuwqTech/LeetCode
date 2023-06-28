package algorithm.easy;

import java.util.HashSet;
import java.util.Set;

public class T349两个数组的交集 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}
