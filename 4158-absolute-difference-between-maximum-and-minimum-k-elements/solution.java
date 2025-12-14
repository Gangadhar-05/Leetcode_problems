class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int lsum=0;
        int ssum=0;
        for(int i=0;i<k;i++){
            ssum+=nums[i];
        }
        for(int j=n-1;j>n-1-k;j--){
            lsum+=nums[j];
        }
        return Math.abs(ssum-lsum);
    }
}
