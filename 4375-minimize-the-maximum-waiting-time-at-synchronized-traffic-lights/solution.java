class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxLight=lights[0];
        for(int light:lights){
            maxLight=Math.max(maxLight,light);
        }
        int maxWait=0;
        for(int time:arrivalTime){
            int r=time%period;
            int wait;
            if(r<maxLight){
                wait=0;
            }else{
                wait=period-r;
            }
            maxWait=Math.max(wait,maxWait);
        }
        return maxWait;
    }
}
