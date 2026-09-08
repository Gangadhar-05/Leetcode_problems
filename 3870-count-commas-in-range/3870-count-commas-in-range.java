class Solution {
    public int countCommas(int n) {
        int ans=0;
        if(n>=1000){
            ans+=(n-999);
        }else if(n>=10000){
            ans+=(n-9999);
        }else if(n>=100000){
            ans+=(n-99999);
        }
        return ans;
    }
}