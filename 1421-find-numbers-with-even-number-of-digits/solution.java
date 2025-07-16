class Solution {
    static boolean isevendigit(int[] nums,int i){
        int cnt=0;
        while(nums[i]>0){
            
            nums[i]/=10;
            cnt++;
        }
        return (cnt%2==0);
    }
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(isevendigit(nums,i)){
                res++;
            }
        }
        return res;
    }
}
