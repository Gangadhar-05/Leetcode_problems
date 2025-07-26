class Solution {
    public int differenceOfSum(int[] nums) {
       int sum=0;
       int digitsum=0;
       for(int i=0;i<nums.length;i++){
         sum+=nums[i];
         if(nums[i]<=9) {
            digitsum+=nums[i];
         }
         else{
            while(nums[i]>0){
               digitsum+=nums[i]%10;
                nums[i]/=10;  
            }
         }
       } 
       int result=Math.abs(sum-digitsum);
       return result;
    }
}
