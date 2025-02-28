int missingNumber(int* nums, int numsSize) {
    int sum=0;
    int totalsum;
    int n=numsSize;


    for(int i=0;i<n;i++){
        sum+=nums[i];
        totalsum=n*(n+1)/2;
        
       
    }return totalsum-sum;
}
