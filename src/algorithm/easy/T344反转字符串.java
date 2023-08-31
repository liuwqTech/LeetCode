package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-06-28-15:34
 */
public class T344反转字符串 {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
        }
    }
}
