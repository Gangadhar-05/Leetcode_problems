class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int maxSum=0;
        int lm=nums[0];
        
            
            for(int j=k;j<n;j++){
            
                lm=Math.max(lm,nums[j-k]);
                maxSum=Math.max(maxSum,lm+nums[j]);
            }
            
        
        return maxSum;
    }
}
