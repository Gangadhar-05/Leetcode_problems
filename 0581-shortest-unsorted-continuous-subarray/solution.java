class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int l = 0;
        int r = n - 1;

        // Find first position from left where order breaks
        while (l < n - 1 && nums[l] <= nums[l + 1]) {
            l++;
        }

        // Already sorted
        if (l == n - 1) {
            return 0;
        }

        // Find first position from right where order breaks
        while (r > 0 && nums[r] >= nums[r - 1]) {
            r--;
        }

        int min = nums[l];
        int max = nums[l];

        // Find min and max in unsorted part
        for (int i = l; i <= r; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Extend left
        while (l > 0 && nums[l - 1] > min) {
            l--;
        }

        // Extend right
        while (r < n - 1 && nums[r + 1] < max) {
            r++;
        }

        return r - l + 1;
    }
}
