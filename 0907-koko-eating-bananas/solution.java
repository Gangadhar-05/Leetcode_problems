class Solution {
    public boolean canFinish(int[] piles,int h,int k){
        long hour=0;
        for(int pile:piles){
            hour+=pile/k;
            if(pile%k!=0)hour++;
        }
        return (hour<=h);
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(pile,right);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canFinish(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }else {
                left=mid+1;
            }
            
        }

       return ans;
        
    }
}
