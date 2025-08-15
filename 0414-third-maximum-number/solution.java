class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int cnt=1;
        int prev=nums[nums.length-1];
         
           for(int i=nums.length-2;i>=0;i--){
            if(prev!=nums[i])cnt++;
            prev=nums[i];
            if(cnt==3){
                res=nums[i];
                break;
            }
           }
         if(cnt!=3) return nums[nums.length-1];

        return res;

    }
}
