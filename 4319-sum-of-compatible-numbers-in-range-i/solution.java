class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int a=Math.max(1,n-k);
        int b=n+k;
        for(int i=a;i<=b;i++){
            if((n&i)==0)sum+=i;
        }
        return sum;
        
    }
}
