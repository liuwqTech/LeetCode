package algorithm.easy;

/**
 * @author liuwq
 * @create 2023-04-29 09:52
 */
public class T206反转链表 {
    public static void main(String[] args) {

    }
    //迭代
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    //递归
    public ListNode reverseList2(ListNode head) {
        return reverse(null,head);
    }
    ListNode reverse(ListNode pre, ListNode cur){
        if (cur == null) return pre;
        ListNode temp = cur.next;
        cur.next = pre;
        return reverse(cur,temp);
    }
}
