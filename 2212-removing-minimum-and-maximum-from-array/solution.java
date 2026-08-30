class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        if (n < 2) return n;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd = 0;
        int maxInd = 0;

        for (int k = 0; k < n; k++) {
            if (nums[k] < min) {
                min = nums[k];
                minInd = k;
            }

            if (nums[k] > max) {
                max = nums[k];
                maxInd = k;
            }
        }

        int left = Math.min(minInd, maxInd);
        int right = Math.max(minInd, maxInd);

        int fromFront = right + 1;
        int fromBack = n - left;
        int bothSides = (left + 1) + (n - right);

        return Math.min(fromFront, Math.min(fromBack, bothSides));
    }
}
