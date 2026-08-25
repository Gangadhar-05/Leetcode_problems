class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];
        int[] diff=new int[n+1];
       for(int[] booking:bookings){
            int l=booking[0]-1;
            int r=booking[1]-1;
            int val=booking[2];
            diff[l]+=val;
            diff[r+1]-=val;
        }
        int[] pref=new int[n];
        pref[0]=diff[0];
        for(int i=1;i<n;i++){
            pref[i]+=pref[i-1]+diff[i];
        }
        for(int i=0;i<n;i++){
            arr[i]+=pref[i];
        }
        return arr;
    }
}
