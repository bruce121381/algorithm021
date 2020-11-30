package com.geektime.week01.practical.no206_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no206_1
 * Description:
 *
 * @date:2020/11/30 12:49
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {
    class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp = null;
        ListNode cur = head;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
