class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt=0;
        int m=fruits.length;
        int n=baskets.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(baskets[j]>=fruits[i]){
                    cnt++;
                    baskets[j]=0;
                    break;
                }
               
            } 
        }
        return fruits.length-cnt;
    }
}
