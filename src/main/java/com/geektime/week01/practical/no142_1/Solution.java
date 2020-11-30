package com.geektime.week01.practical.no142_1;

/**
 * ClassName:Solution
 * PackageName:com.geektime.week01.practical.no142_1
 * Description:
 *
 * @date:2020/11/30 14:29
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

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (slow == fast) {
                ListNode curHead = head;
                while (slow != curHead) {
                    slow = slow.next;
                    curHead = curHead.next;
                }
                return slow;
            }
        }
        return null;
    }
}
