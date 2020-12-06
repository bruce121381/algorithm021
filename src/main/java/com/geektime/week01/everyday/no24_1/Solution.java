package com.geektime.week01.everyday.no24_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.everyday.no24_1
 * Description:
 *
 * @date:2020/12/3 17:19
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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode next = head.next;
        ListNode nextHead = swapPairs(head.next);
        head.next = nextHead;
        next.next = head;
        return next;
    }

}
