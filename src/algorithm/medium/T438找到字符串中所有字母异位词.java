package algorithm.medium;

import java.util.*;

public class T438找到字符串中所有字母异位词 {
    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] arrayS = new int[26], arrayP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            arrayP[p.charAt(i) - 'a']++;
        }
        int left = 0, right = 0;
        while (right < s.length()){
            // 加入窗口数据
            arrayS[s.charAt(right) - 'a']++;
            if (right - left + 1 == p.length()){
                if (Arrays.equals(arrayS, arrayP)){
                    result.add(left);
                }
                arrayS[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
}
