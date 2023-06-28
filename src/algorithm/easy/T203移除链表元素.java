package algorithm.easy;

import algorithm.common.ListNode;

public class T203移除链表元素 {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1,head);
        ListNode cur = dummy;
        while (cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
