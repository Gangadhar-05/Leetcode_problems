class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time=0;
        int curr=0;
        for(int r:requests){
            time+=Math.abs(r-curr);
            curr=r;
        }
        return time;
    }
}
