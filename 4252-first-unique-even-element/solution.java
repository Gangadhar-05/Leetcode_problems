class Solution {
     public boolean uniqueCheck(int x ,int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                cnt++;
            }
           }
          if(cnt==1){
    return true;
       }else return false;
         
  }
  
     
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
       if(nums[i]%2==0 && uniqueCheck(nums[i],nums))
           return nums[i];
            
        }
        return -1;
    }
}
