package algorithm.easy;

import java.util.List;

/**
 * @author liuwq
 * @create 2023-04-26 09:43
 */
public class T1773统计匹配检索规则的物品数量 {
    public static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equalsIgnoreCase("type")){
                if (items.get(i).get(0).equalsIgnoreCase(ruleValue)) count++;
            }else if (ruleKey.equalsIgnoreCase("color")){
                if (items.get(i).get(1).equalsIgnoreCase(ruleValue)) count++;
            }else {
                if (items.get(i).get(2).equalsIgnoreCase(ruleValue)) count++;
            }
        }
        return count;
    }
}
