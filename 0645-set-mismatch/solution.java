class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] arr=new int[2];
        int sum=0;
         for(int i=0;i<n;i++){
           sum+=nums[i];
        }
        for(int i=1;i<=n-1;i++){
            if(nums[i]==nums[i-1]){
                arr[0]=nums[i];
            }
        }
        int Asum=(n*(n+1))/2;
        int x=sum-arr[0];
        arr[1]=Asum-x;
        return arr;
    }
}
