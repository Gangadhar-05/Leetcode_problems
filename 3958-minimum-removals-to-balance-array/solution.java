// 
import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = n;
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            while (nums[j] > (long) nums[i] * k) {
                i++;
            }
            ans = Math.min(ans, n - (j - i + 1));
        }
        
        return ans;
    }
}

