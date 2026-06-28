class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<k;i++){
            int ind=n-i-1;
            if(mul<1){
                sum+=nums[ind];
            }else{
                
                sum+=(long)mul * nums[ind];    
            }
            mul--;
        }
        return sum;
    }
}
