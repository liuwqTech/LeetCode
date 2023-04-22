package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-22 17:25
 */
public class T2011执行操作后的变量值 {
    public static void main(String[] args) {
        
    }
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equalsIgnoreCase("--X") || operations[i].equalsIgnoreCase("X--")){
                X -= 1;
            }else {
                X += 1;
            }
        }
        return X;
    }
}
