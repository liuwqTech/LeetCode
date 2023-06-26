package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-29 10:40
 */
public class LCP01猜数字 {
    public static void main(String[] args) {

    }
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) count++;
        }
        return count;
    }
}
