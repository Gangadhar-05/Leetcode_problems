class Solution {
    static int digitsum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=digitsum(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
