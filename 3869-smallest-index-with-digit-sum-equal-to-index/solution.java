class Solution {
    static boolean Digitsum(int []nums,int i){
            int sum=0;
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            return sum==i;
        }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(Digitsum(nums,i)){
                return i;
            }
        }
        return -1;
       
        
    }
}
