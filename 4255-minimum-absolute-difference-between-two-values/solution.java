class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n=nums.length;
        int ocnt=0;
        int tcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)ocnt++;
            else if(nums[i]==2)tcnt++;
        }
        if(ocnt==0 || tcnt==0)return -1;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==1 && nums[j]==2){
                    int diff=Math.abs(i-j);
                    min=Math.min(min,diff);
                }
            }
        }
        return min;
        
    }
}
