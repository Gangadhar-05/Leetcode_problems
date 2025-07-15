class Solution {
    public int findNonMinOrMax(int[] nums) {
     int minvalue=nums[0];
     int maxvalue=nums[0];
     for(int i=0;i<nums.length;i++){
        minvalue=Math.min(minvalue,nums[i]);
        maxvalue=Math.max(maxvalue,nums[i]);
     }  
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=minvalue && nums[i]!=maxvalue) return nums[i];
     } 
     return -1;
    }
}
