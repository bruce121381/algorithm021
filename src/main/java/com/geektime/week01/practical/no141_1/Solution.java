package com.geektime.week01.practical.no141_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no141_1
 * Description:
 *
 * @date:2020/11/30 12:53
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

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
