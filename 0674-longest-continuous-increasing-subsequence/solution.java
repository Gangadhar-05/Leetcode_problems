class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int cnt=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                cnt++;
                max=Math.max(max,cnt);
            }else{
                cnt=1;
            }
        }
        return max;
    }
}
