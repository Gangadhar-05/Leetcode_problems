class Solution {
    static int smallcnt(int nums[] ,int n){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<n) cnt++;
        }
        return cnt;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=smallcnt(nums,nums[i]);
        }
        return arr;
    }
}
