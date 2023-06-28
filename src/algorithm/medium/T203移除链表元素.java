package algorithm.medium;

import algorithm.common.ListNode;

/**
 * @author liuwq
 * @create 2023-04-28 21:22
 */
public class T203移除链表元素 {
    public static void main(String[] args) {
    }
}
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) return -1;
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;
        size++;
        ListNode newNode = new ListNode(val);        
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size - 1) return;
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
}
