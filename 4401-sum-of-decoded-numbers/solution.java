class Solution {
    public long power(long x,long y,long MOD){
        x%=MOD;
        long res=1;
        while(y>0){
            if((y&1)==1){
                res=(res*x)%MOD;
            }
            x=(x*x)%MOD;
            y>>=1;
        }
        return res;
    }
    
    public int sumDecoded(long[] nums) {
        long ans=0;
        int MOD=1000000007;
        for(long num:nums){
            long w=num%10;
            long d=num/10;
            String s=String.valueOf(d);
            long x=Long.parseLong(s.substring(0,(int)w));
            long y=Long.parseLong(s.substring((int)w));
            long pxy=power(x,y,MOD);
            ans=(ans+pxy)%MOD;
            
        }
        return (int)ans;
    }
}
