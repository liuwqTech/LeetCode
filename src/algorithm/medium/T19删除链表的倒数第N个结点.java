package algorithm.medium;

import algorithm.common.ListNode;

public class T19删除链表的倒数第N个结点 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumyNode = new ListNode(0,head);

        // 快慢指针都指向虚拟头节点
        ListNode fastNode = dumyNode;
        ListNode slowNode = dumyNode;

        // 快指针往后移n+1步
        n++;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }

        // 快慢指针同时移动
        while (fastNode != null){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        // 删除节点
        slowNode.next = slowNode.next.next;

        // 返回头节点
        return dumyNode.next;
    }

}
