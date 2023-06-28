package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-06-27-20:07
 */
public class T383赎金信 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        for (char c : magazine.toCharArray()){
            record[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()){
            record[c - 'a']--;
        }
        // 如果数组中存在负数，说明ransomNote字符串总存在magazine中没有的字符
        for (int i : record){
            if (i < 0){
                return false;
            }
        }
        return true;
    }
}
