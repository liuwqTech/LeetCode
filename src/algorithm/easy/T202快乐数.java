package algorithm.easy;

import java.util.HashSet;
import java.util.Set;

public class T202快乐数 {
    public static void main(String[] args) {
        System.out.println(calc(19));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = calc(n);
        }
        return n == 1;
    }

    public static int calc(int number){
        int sum = 0;
        while (number > 0){
            int temp = number % 10;
            sum += temp * temp;
            number /= 10;
        }
        return sum;
    }
}
