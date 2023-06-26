package algorithm.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuwq
 * @create 2023-04-25 21:53
 */
public class T904水果成篮 {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1,2,3,2,2}));
    }
    public static int totalFruit(int[] fruits) {
        int result = 0;
        int i = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j = 0; j < fruits.length; j++) {
            map.put(fruits[j], map.getOrDefault(fruits[j],0) + 1);
            while (map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
