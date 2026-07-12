class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD=1000000007L;
        
        long cnt=0;
        long ans=0;
        long avail=k;
        for(int num:nums){
           if(avail<num){
           long need=num-avail;
            long x=(need+k-1)/k;

        long n=2L*cnt +x+1;
        long d=x;
        if((n&1)==0){
            n/=2;
        }else{
            d/=2;
        }

    

            long add=((n%MOD)*(d%MOD))%MOD;
            ans=(ans+add)%MOD;

            
            cnt+=x;
            avail+=x*k;

           }

                avail-=num;      
        }
        return (int)(ans%MOD);
    }
}
