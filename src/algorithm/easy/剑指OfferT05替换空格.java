package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-06-28-16:43
 */
public class 剑指OfferT05替换空格 {
    public static void main(String[] args) {

    }

    // 方法1
    public String replaceSpace1(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c == ' '){
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //方法2
    public String replaceSpace2(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        // 扩充空间，空格数量的2倍
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                sb.append("  ");
            }
        }
        // 若是没有空格，直接返回
        if (s.length() == 0) return s;
        // 若有空格，定义两个指针
        int left = s.length() - 1; // 左指针：指向原始字符串最后一个位置
        s += sb.toString();
        int right = s.length() - 1; // 右指针：指向扩展字符串的最后一个位置
        char[] chars = s.toCharArray();
        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            }else {
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return new String(chars);
    }
}
