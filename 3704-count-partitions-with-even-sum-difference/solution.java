class Solution {
    public int countPartitions(int[] nums) {
       int ways=0;
       int totalsum=0;
       for(int i=0;i<nums.length;i++){
        totalsum+=nums[i];
       }
        int lsum=0;
       for(int i=0;i<nums.length-1;i++){
         lsum+=nums[i];
         int rsum=totalsum-lsum;
         if(Math.abs(lsum-rsum)%2==0){
            ways++;
         }
       }
       return ways;
    }
}
