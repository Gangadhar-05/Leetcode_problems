class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int presentmax=0;
        for (int i=0;i<gain.length;i++){
            presentmax+=gain[i];
            if(max<presentmax){
                max=presentmax;
            }
        }
        return max;
    }
}
