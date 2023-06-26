package algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuwq
 * @create 2023-05-08 23:21
 */
public class T1281整数的各位积和之差 {
    public static void main(String[] args) {

    }
    public static int subtractProductAndSum(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 0){
            list.add(n % 10);
            n /= 10;
        }
        int amass = 1, sum = 0;
        for (int i = 0; i < list.size(); i++) {
            amass *= list.get(i);
            sum += list.get(i);
        }
        return amass - sum;
    }
}
