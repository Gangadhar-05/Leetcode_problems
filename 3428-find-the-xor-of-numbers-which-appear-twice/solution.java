class Solution {

    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);

       int sum=0;
            for(int i=1;i<=nums.length-1;i++){
                if(nums[i]==nums[i-1])
                sum^=nums[i];
            }
            return sum;
    }
}
