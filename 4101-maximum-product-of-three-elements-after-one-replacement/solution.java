class Solution {
    public long maxProduct(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(nums[i]);
        }
        Arrays.sort(arr);
        int n=nums.length;
        long res=100000L*arr[n-1]*arr[n-2];
        return res;
    }
}
