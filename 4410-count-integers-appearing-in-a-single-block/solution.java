class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
       int[] farr=new int[101];
       int[] larr=new int[101];
    int[] cnt=new int[101];
        Arrays.fill(farr,-1);
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(farr[x]==-1){
                farr[x]=i;
            }
            larr[x]=i;
            cnt[x]++;
        }
        int ans=0;
        for(int x=1;x<=100;x++){
            if(cnt[x]>0 && larr[x]-farr[x]+1==cnt[x])ans++;
        }
        return ans;
    }
}
