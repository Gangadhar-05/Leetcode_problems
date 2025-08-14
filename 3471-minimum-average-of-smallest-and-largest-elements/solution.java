class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double[] avg=new double[n/2];
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        while(i<n/2){
            avg[i]=(nums[i]+nums[j])/2.0;
            i++;
            j--;

        }
        Arrays.sort(avg);
        return avg[0];
    }
}
