package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-07-11-14:57
 */
public class 剑指OfferT58II左旋转字符串 {
    public static void main(String[] args) {

    }

    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        // 1. 反转区间为前n的子串
        reverse(chars, 0, n-1);
        // 2. 反转区间为n到末尾的子串
        reverse(chars, n, chars.length-1);
        // 3. 反转整个区间的字符串
        reverse(chars, 0, chars.length-1);

        return new String(chars);
    }

    public static void reverse(char[] chars, int left, int right) {
        if (right >= chars.length) System.out.println("set a wrong right number!");
        while (left < right) {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
    }
}
