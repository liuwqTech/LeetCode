package algorithm.medium;

import algorithm.common.ListNode;

/**
 * @author liuwq
 * @create 2023-04-29 19:14
 */
public class T24两两交换链表中的节点 {
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(-1,head);
        ListNode cur = dummyHead;
        ListNode temp;
        ListNode firstNode;
        ListNode secondNode;
        while (cur.next != null && cur.next.next != null){
            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;
            cur.next = secondNode;
            cur.next.next = firstNode;
            cur.next.next.next = temp;
            cur = cur.next.next;
        }
        return dummyHead.next;
    }
}
