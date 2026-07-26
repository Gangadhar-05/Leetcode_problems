class Solution {
    public int dCnt(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public int dSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;        
        }
        return sum;
    }
    public int largestInteger(int n, int s) {
        if(s==0)return 0;
        double range=Math.pow(10,n);
        int res=(int)range-1;
        while(dCnt(res)==n){
            if(dSum(res)==s){
                return res;
            }else{
                res--;
            }
        }
        
        return -1;
    }
}
