class Solution {
    public int rsum(int[] nums,int m){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+m-1)/m;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=0;
        for(int num:nums){max=Math.max(max,num);}
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(rsum(nums,mid)<=threshold){
                high=mid-1;
                
            }else{
               low=mid+1;
            }
        }
        return low;
    }
}