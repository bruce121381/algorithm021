package com.geektime.week01.homework.no21_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.homework.no21_1
 * Description:
 *
 * @date:2020/11/30 15:58
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int value) {
            this.val = value;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode retNode = new ListNode(0);
        ListNode head = retNode;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                head.next = l2;
                l2 = l2.next;
            } else {
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return retNode.next;
    }

}
