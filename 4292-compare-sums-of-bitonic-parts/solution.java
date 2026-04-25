class Solution {
    public int compareBitonicSums(int[] nums) {
        int n=nums.length;
        
        int peak=0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[peak]){
             peak=i;
            }
        }
        long asum=0;
        long dsum=0;
        for(int i=0;i<=peak;i++){
            asum+=nums[i];
        }
         for(int i=peak;i<n;i++){
             dsum+=nums[i];
        }
        if(asum>dsum)return 0;
        else if(asum<dsum)return 1;
        return -1;
    }
}
