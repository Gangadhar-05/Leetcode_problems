class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int n=num;
        while(n>0){
            int ld=n%10;
            if(ld!=0 && num%ld==0){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
}
