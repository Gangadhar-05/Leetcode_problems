class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        // int alice=0;
        // int bob=0;
        // int i=0;
        // int j=n-1;
        // while(i<=n/2){
        //     alice+=Math.max(piles[i],piles[j]);
        //     bob+=Math.min(piles[i],piles[j]);
        //     i++;
        //     j--;
        // }
       
        // if(alice>bob)return true;
        // else return false;
        int es = 0,os = 0;
        for(int i = 0;i < n;i++){
            if(piles[i] % 2 == 0) es+=piles[i];
            else os+=piles[i];
        }
        return (es != os);
    }
}
