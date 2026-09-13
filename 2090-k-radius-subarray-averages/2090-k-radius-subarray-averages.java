class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int windowSize = 2 * k + 1;
        int[] ans=new int[n];
        Arrays.fill(ans, -1);
        if (windowSize> n) return ans;
        long sum=0;
        for(int i=0;i<windowSize;i++){
            sum+=nums[i];
        }
        int c=k;
        ans[c]=(int)(sum/windowSize);
        int l=0;
        int r=windowSize;
        while(r<n){
            sum-=nums[l];
            sum+=nums[r];
            l++;
            r++;
            c++;
            ans[c]=(int)(sum/windowSize); 
        }
        return ans;
    }
}