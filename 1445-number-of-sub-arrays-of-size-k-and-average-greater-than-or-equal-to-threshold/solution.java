class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];       
        }
        double avg=sum/k;
        if(avg>=threshold)cnt++;
        int left=0;
        int right=k;
        while(right<arr.length){
            sum-=arr[left];
            sum+=arr[right];
            avg=sum/k;
            if(avg>=threshold)cnt++;
            left++;
            right++;
        }
        return cnt;
    }
}
