package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-26 09:19
 */
public class T2651计算列车到站时间 {
    public static void main(String[] args) {

    }
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if (arrivalTime + delayedTime > 24) return arrivalTime + delayedTime - 24;
        else if (arrivalTime + delayedTime < 24) return arrivalTime + delayedTime;
        else return 0;
    }
}
