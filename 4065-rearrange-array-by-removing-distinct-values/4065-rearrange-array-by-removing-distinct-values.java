class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        int[] ans=new int[n];
        int ind=0;
        while(ind<n){
            for(int i=1;i<=100;i++){
            if(freq[i]>0){
                freq[i]--;
                ans[ind++]=i;
            }
        }

    }
        
        return ans;
    }
}