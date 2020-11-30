package com.geektime.week01.practical.no24_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no24_1
 * Description:
 *
 * @date:2020/11/30 14:44
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

    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

}
