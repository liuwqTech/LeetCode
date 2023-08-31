package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-06-28-15:47
 */
public class T541反转字符串II {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        char[] charStr = s.toCharArray();
        for (int i = 0; i < charStr.length; i += (2*k)) {
            int left = i;
            // 判断尾数够不够k个来取决end指针的位置
            int right = Math.min(i + k - 1, charStr.length - 1);
            while (left < right){
                char temp = charStr[right];
                charStr[right] = charStr[left];
                charStr[left] = temp;
                left++;
                right--;
            }
        }
        return new String(charStr);
    }
}
