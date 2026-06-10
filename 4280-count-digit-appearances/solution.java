class Solution {
    public int digitCount(int num,int digit){
        int count=0;
        while(num>0){
            int l=num%10;
            if(l==digit)count++;
            num/=10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=digitCount(nums[i],digit);
        }
        return cnt;
    }
}
