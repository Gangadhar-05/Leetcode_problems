class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;;
        int n=costs.length;
        for(int i=0;i<n;i++){
            if(costs[i]<=coins){
                cnt++;
                coins-=costs[i];

            }
        }
        return cnt;
    }
}
