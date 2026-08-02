class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int cnt=0;
        int n=nums.length;
        int ans=0;
        
        for(int i=0;i<n;i++){
            int ecnt=0;
            int ocnt=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    ecnt++;
                }else{
                    ocnt++;
                }
                if(ocnt>0 &&(ecnt*b)<=(a*ocnt))ans++;
            }
            
            
            
        }
        return ans;
    }
}
