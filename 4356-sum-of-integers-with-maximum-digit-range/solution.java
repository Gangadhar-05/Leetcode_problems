class Solution {
    public int digitRange(long num){
        int s=9;
        int l=0;
        while(num>0){
            int digit=(int)num%10;
            s=Math.min(s,digit);
            l=Math.max(l,digit);
            num/=10;
        }
        return l-s;
    }
    public int maxDigitRange(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,digitRange(num));
        }
        int sum=0;
        for(int num:nums){
            if(digitRange(num)==max){
                sum+=num;
            }
        }
        return sum;
    }
}
