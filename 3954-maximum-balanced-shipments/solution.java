class Solution {
    public int maxBalancedShipments(int[] weight) {
        int cnt =0 ;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<weight.length;i++){
           max = Math.max(max,weight[i]);
            if(max > weight[i]){
                cnt++;
                max=0;
            }
        }

        return cnt;
    }
}
