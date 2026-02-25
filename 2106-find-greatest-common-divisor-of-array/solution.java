class Solution {

    public int findGCD(int[] nums) {
    int a=nums[0]; 
    int b=nums[0];   
    for(int i=0;i<nums.length;i++){
        a=Math.min(a,nums[i]);
        b=Math.max(b,nums[i]);
    }
    
        
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        
        return result;
   
    
       
    }
      
}
