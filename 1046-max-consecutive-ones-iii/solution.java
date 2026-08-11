class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;

        int l=0;
        int cnt=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0)cnt++;
            while(cnt>k){
                if(nums[l]==0){
                    cnt--;
                }
                l++;
            }
            max=Math.max(r-l+1,max);
        }
        return max;
    }
}
