package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-26 10:24
 */
public class T2652倍数求和 {
    public static void main(String[] args) {

    }
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
