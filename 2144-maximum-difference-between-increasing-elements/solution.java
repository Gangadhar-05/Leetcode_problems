class Solution {
    public int maximumDifference(int[] nums) {
        int MAXdiff=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]<nums[j]){
              int  diff=nums[j]-nums[i];
                MAXdiff=Math.max(diff,MAXdiff);

            }
            }
        }
        return MAXdiff;
    }
}
