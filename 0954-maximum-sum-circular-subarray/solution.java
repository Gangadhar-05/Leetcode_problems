class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int currMax=0;
        int maxSum=nums[0];
        int currMin=0;
        int minSum=nums[0];

        int total=0;

        for(int num:nums){
            total+=num;
            currMax+=num;
            maxSum=Math.max(maxSum,currMax);
            if(currMax<0)currMax=0;

            currMin+=num;
            minSum=Math.min(minSum,currMin);
            if(currMin>0)currMin=0;

        }

        if(maxSum<0){
            return maxSum;
        }
        

        
        return Math.max(maxSum,total-minSum);
        
    }
}
