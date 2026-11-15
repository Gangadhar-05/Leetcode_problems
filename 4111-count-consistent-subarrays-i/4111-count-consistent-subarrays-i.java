class Solution {
    public int countConsistent(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int bt=nums[i];
                int minV=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    bt=bt&nums[k];
                    minV=Math.min(minV,nums[k]);
                }
                if(minV==bt)cnt++;
            }
        }
        return cnt;
    }
}