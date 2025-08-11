class Solution {
    public int averageValue(int[] nums) {
        int cnt=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                cnt++;
                sum+=nums[i];
            }
        }
        if(cnt==0){
            return 0;
        }else{
        return sum/cnt;
        }
    }
}
