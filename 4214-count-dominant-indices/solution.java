class Solution {
   
    public int dominantIndices(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            int n=nums.length-i-1;
            for(int j=i+1;j<nums.length;j++){
            sum+=nums[j];
            }
            int avg=sum/n;
            if(nums[i]>avg){
                cnt++;
            }
        }
        
        return cnt;
    }
}
