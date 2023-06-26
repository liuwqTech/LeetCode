package algorithm.easy;

import java.util.List;

/**
 * @author liuwq
 * @create 2023-04-28 20:42
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
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
