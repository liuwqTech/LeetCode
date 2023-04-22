package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-22 17:12
 */
public class T2469温度转换 {
    public static void main(String[] args) {

    }
    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}
