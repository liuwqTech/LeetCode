package algorithm.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T350两个数组的交集II {
    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums1){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums2){
            if (map.containsKey(num) && map.get(num) > 0){
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
