package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-23 16:30
 */
public class T69x的平方根 {
    public static void main(String[] args) {

    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1;
        int right = x / 2;
        int result = -1;
        while (left <= right){
            int middle = left + (right - left) / 2;
            if (middle <= x / middle){
                result = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }
}
