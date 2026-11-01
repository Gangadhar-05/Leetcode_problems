class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int currsum=0;
        for(int num:nums){
            currsum+=num;
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0)currsum=0;
        }
         currsum=0;
        for(int num:nums){
            currsum+=num;
            minsum=Math.min(minsum,currsum);
            if(currsum>0)currsum=0;
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}