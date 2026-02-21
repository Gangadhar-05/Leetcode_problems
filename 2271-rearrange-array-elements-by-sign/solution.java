class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pArr=new int[n/2];
        int[] nArr=new int[n/2];
        int n1=0;
        int n2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pArr[n1++]=nums[i];
            }else{
                nArr[n2++]=nums[i];
            }
        }
        n1=0;
        n2=0;
        for(int i=0;i<n && n1<n/2;i+=2){
            nums[i]=pArr[n1++];
        }
         for(int i=1;i<n && n2<n/2;i+=2){
            nums[i]=nArr[n2++];
        }
        return nums;
    }
}
