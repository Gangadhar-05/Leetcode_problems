class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        if(n<2)return false;
        Arrays.sort(nums);
        if(nums[n-1]!=nums[n-2] || nums[n-1]!=n-1)return false;
        for(int i=1;i<n-1;i++){
            if(nums[i]-nums[i-1]!=1)return false;


        }
        return true;
    }
}
