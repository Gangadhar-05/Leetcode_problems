class Solution {
    public int ls(long num){
        return (int)Math.abs(num%10);
    }
    public int fs(long num){
        num=Math.abs(num);
        while(num>=10){
            num/=10;
        }
        return (int)num;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int cnt=0;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int left=0;left<n;left++){
            for(int right=left;right<n;right++){
                long num=prefix[right+1]-prefix[left];
                if(ls(num)==x && fs(num)==x){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}
