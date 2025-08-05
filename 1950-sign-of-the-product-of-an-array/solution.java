class Solution {
    public int arraySign(int[] nums) {
       
       int n =nums.length;
       int zerocnt=0;
       int negativecnt=0;
       for(int i=0;i<n;i++){
       if(nums[i]<0)negativecnt++;
       else if(nums[i]==0) zerocnt++;
       } 
       if(zerocnt>0)return 0;
       else if(negativecnt%2==0) return 1;
       else return -1;
    }
}
