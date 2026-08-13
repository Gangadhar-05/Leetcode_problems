class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int zcnt=0;
        int max=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0)zcnt++;
            while(zcnt>1){
                if(nums[l]==0){
                    zcnt--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max==0?0:max-1;
    }
}
