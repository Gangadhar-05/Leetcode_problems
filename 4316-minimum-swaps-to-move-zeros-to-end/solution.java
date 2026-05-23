class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int zcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)zcnt++;
        }
        int cnt=0;
        for(int j=n-zcnt;j<n;j++){
            if(nums[j]==0)cnt++;
        }
        return zcnt-cnt;
    }
}
