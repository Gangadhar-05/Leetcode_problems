class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(nums[i]);
        }
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum-=(arr[i]*arr[i]);
        }
        for(int i=n/2;i<n;i++){
            sum+=(arr[i]*arr[i]);
        }
        return sum;
    } 
}