class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int tsum=0;
        for(int num:nums){
            tsum+=num;
        }
        
        int sum=0;
        if(tsum-nums[0]==0)return 0;
        for(int i=1;i<n;i++){
            sum+=nums[i-1];
            int rsum=tsum-sum-nums[i];
            if(sum==rsum){
                return i;
            }
        }
        return -1;
    }
}
