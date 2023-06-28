package algorithm.easy;

public class T242有效的字母异位词 {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            // 如果record数组里面有不为0的，说明s和t中字母一定不一致
            if (record[i] != 0){
                return false;
            }
        }
        return true;
    }
}
