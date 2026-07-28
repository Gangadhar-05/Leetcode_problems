class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            maxAvg=sum/k;
        }
        int left=0;
        int right=k;
        while(right<nums.length){
            sum-=nums[left];
            sum+=nums[right];
            maxAvg=Math.max(maxAvg,sum/k);
            left++;
            right++;
        }
        return maxAvg;
        
    }
}
