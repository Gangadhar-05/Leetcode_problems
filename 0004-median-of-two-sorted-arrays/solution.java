class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int N=n1+n2;
        int[] arr=new int[N];
        int j=0;
        for(int i=0;i<n1;i++){
            arr[j++]=nums1[i];

        }
        for(int i=0;i<n2;i++){
            arr[j++]=nums2[i];
        }
        Arrays.sort(arr);
        double median=0;
        int m=N-1;
        if(N%2==0){
            median=(arr[m/2]+arr[(m/2)+1])/2.0;
        }else{
            median=arr[m/2];
        }
        return median;
    }
}
