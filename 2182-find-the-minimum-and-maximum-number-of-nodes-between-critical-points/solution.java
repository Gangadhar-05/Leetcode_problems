class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        int pos = 1;
        int first = -1;
        int last = -1;

        int min = Integer.MAX_VALUE;

        while (curr.next != null) {

            // Check if curr is a critical point
            if ((prev.val > curr.val && curr.val < curr.next.val) ||
                (prev.val < curr.val && curr.val > curr.next.val)) {

                // First critical point
                if (first == -1) {
                    first = pos;
                }

                // Calculate distance from previous critical point
                if (last != -1) {
                    min = Math.min(min, pos - last);
                }

                last = pos;
            }

            pos++;
            prev = curr;
            curr = curr.next;
        }

        // Less than 2 critical points
        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }

        // Maximum distance = last critical point - first critical point
        int max = last - first;

        return new int[]{min, max};
    }
}
