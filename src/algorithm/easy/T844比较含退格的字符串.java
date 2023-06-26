package algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuwq
 * @create 2023-04-24 21:28
 */
public class T844比较含退格的字符串 {
    public static void main(String[] args) {

    }
    public boolean backspaceCompare(String s, String t) {
        String res1 = getString(s);
        String res2 = getString(t);
        if (res1.equalsIgnoreCase(res2)){
            return true;
        }
        return false;
    }
    public String getString(String s){
        List<Character> list = new ArrayList<>();
        int fast, slow = 0;
        for (fast = 0; fast < s.length(); fast++) {
            if (s.charAt(fast) != '#'){
                list.add(s.charAt(fast));
                slow++;
            }else {
                if (!list.isEmpty()){
                    list.remove(slow - 1);
                    slow--;
                }
            }
        }
        return list.toString();
    }
}
