class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for(int i=nums.length-2;i>=0;i=-2){
            sum+=nums[i];
        }
        long medianSum = 0;
        int medianIndex;
        for(int i=0;i<nums.length/3;i++){
         medianIndex = nums.length-2-(2*i);
        medianSum+=nums[medianIndex];
        }
        return medianSum;
    }
}
