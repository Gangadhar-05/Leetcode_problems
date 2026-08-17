class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int max=0;
        int arr[] =new int[n+1];
        for (int i=1;i<=n;i++){
           arr[i]=gain[i-1]+arr[i-1];
           max=Math.max(max,arr[i]);

        }
        return max;
    }
}
