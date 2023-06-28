package algorithm.medium;

import java.util.*;

public class T49字母异位词分组 {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null){
            return new ArrayList<>();
        }
        // map中key存储的是字符串中字母排序后新的字符串
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            // 将每个字符串转换成字符数组
            char[] strChar = strs[i].toCharArray();
            // 进行排序
            Arrays.sort(strChar);
            // 排序后再转换为字符串
            String keyStr = String.valueOf(strChar);
            // 判断map的key中有没有，没有的话把排序好的keyStr放进去
            if (!map.containsKey(keyStr)){
                map.put(keyStr,new ArrayList<>());
            }
            // 如果map的key中原本就有了，把原来的字符串放到value中
            map.get(keyStr).add(strs[i]);

        }
        return new ArrayList<>(map.values());
    }
}
