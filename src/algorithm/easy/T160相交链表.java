package algorithm.easy;

import algorithm.common.ListNode;

public class T160相交链表 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // curA、curB分别指向两个链表的表头
        ListNode curA = headA;
        ListNode curB = headB;

        //分别计算两个链表的长度
        int lengthA = 0;
        int lengthB = 0;
        while (curA != null){
            lengthA++;
            curA = curA.next;
        }
        while (curB != null){
            lengthB++;
            curB = curB.next;
        }

        //恢复链表原有指针状态
        curA = headA;
        curB = headB;

        // 计算长度差，将两个链表移动到末尾对齐的状态
        if (lengthB > lengthA){
            int temp = lengthB;
            lengthB = lengthA;
            lengthA = temp;
            ListNode tempNode = curB;
            curB = curA;
            curA= tempNode;
        }
        int gap = lengthA - lengthB;
        while (gap-- > 0){
            curA = curA.next;
        }

        // 遍历curA和curB，遇到相同则返回
        while (curA != null){
            if (curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
