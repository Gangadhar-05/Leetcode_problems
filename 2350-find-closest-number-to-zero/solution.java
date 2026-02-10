class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
        
            if(Math.abs(nums[i])<Math.abs(min) || nums[i]==Math.abs(min))
                min=nums[i];
            
         }
         return min;
    }
}
