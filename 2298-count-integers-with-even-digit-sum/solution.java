class Solution {
    static int digitsum(int i){
        int sum=0;
        while(i>0){
            int digit=i%10;
            sum+=digit;
            i/=10;
        }
        return sum;
    }
    public int countEven(int num) {
        
        int cnt=0;
        for(int j=1;j<=num;j++){
            if(digitsum(j)%2==0){
                cnt++;
            }
        }
        return cnt;

    }
}
