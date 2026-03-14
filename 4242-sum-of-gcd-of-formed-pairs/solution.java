class Solution {
    public long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        long[] prefixGcd=new long[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(nums[i],max);
        }
        long sum=0;
        Arrays.sort(prefixGcd);
        for(int i=0;i<n/2;i++){
            sum+=gcd(prefixGcd[i],prefixGcd[n-i-1]);
        }
        return sum;
    }
}
