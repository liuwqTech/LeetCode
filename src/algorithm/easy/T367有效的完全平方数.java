package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-24 17:17
 */
public class T367有效的完全平方数 {
    public static void main(String[] args) {
        boolean perfectSquare = isPerfectSquare(808201);
        System.out.println(perfectSquare);
    }
    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        long left = 1, right = num / 2;
        while (left <= right){
            long middle = left + (right - left + 1) / 2;
            if (middle * middle == num){
                return true;
            }else if (middle * middle > num){
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return false;
    }
}
