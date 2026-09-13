class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int l=1;
        int r=0;
        for(int wt:weights){
            r+=wt;
            l=Math.max(l,wt);
        }
        
        
        while(l<=r){
            int m=l+(r-l)/2;
            int reqDays=1;
            int sum=0;
            for(int wt:weights){
                if(sum+wt>m){
                    reqDays++;
                    sum=0;
                }
                sum+=wt;
            }
            if(reqDays>days){
                l=m+1;
            }else{
                r=m-1;
            }
        }

        return l;
    }
}