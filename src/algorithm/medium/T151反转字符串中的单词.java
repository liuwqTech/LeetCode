package algorithm.medium;

/**
 * @author liuwq
 * @create 2023-07-10-15:11
 */
public class T151反转字符串中的单词 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        // 1.去除首尾以及中间多余空格
        chars = removeExtraSpaces(chars);
        // 2.整个字符串反转
        reverse(chars, 0, chars.length - 1);
        // 3.单词反转
        reverseEachWord(chars);
        return new String(chars);
    }

    public static void reverseEachWord(char[] chars) {
        int start = 0;
        // end <= s.length() 这里的 = ，是为了让 end 永远指向单词末尾后一个位置，这样 reverse 的实参更好设置
        for (int end = 0; end <= chars.length; end++) {
            // end 每次到单词末尾后的空格或串尾,开始反转单词
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
    }

    public static void reverse(char[] chars, int left, int right) {
        if (right >= chars.length) {
            System.out.println("set a wrong right number");
        }
        while (left < right) {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
    }

    public static char[] removeExtraSpaces(char[] chars) {
        int slow = 0;
        for (int fast = 0; fast < chars.length; fast++) {
            // 先用 fast 移除所有空格
            if (chars[fast] != ' ') {
                // 再用 slow 加空格。 除第一个单词外，单词末尾要加空格
                if (slow != 0) chars[slow++] = ' ';
                // fast 遇到空格或遍历到字符串末尾，就证明遍历完一个单词了
                while (fast < chars.length && chars[fast] != ' ')
                    chars[slow++] = chars[fast++];
            }
        }
        // 相当于 c++ 里的 resize()
        char[] newChars = new char[slow];
        System.arraycopy(chars, 0, newChars, 0, slow);
        return newChars;
    }
}
