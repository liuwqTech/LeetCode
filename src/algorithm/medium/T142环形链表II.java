package algorithm.medium;

import algorithm.common.ListNode;

public class T142环形链表II {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode){ // 说明有环
                ListNode index1 = fastNode;
                ListNode index2 = head;
                while (index2 != index1){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index2; // 返回环的入口
            }
        }
        return null;
    }
}
