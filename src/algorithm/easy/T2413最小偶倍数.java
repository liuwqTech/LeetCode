package algorithm.easy;

import java.util.Scanner;

/**
 * @author liuwq
 * @create 2023-04-22 16:57
 */
public class T2413最小偶倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = smallestEvenMultiple(n);
        System.out.println(result);
    }
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0){
            return n;
        }else {
            return 2 * n;
        }
    }
}
