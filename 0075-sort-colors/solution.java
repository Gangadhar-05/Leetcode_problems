class Solution {
    public void sortColors(int[] nums) {
       for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                int temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
            }
       } 
          for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                sortColors(nums);
            }
          }
    }
}
