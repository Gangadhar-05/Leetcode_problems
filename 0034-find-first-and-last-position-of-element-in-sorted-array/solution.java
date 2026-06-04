class Solution {
    public static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] < target) {
            low = mid + 1; 
        } else {
            high = mid - 1; 
        }
    }

    return -1; 
}
    public int[] searchRange(int[] nums, int tar) {
        
        int [] res=new int[2];
        int pos=binarySearch(nums,tar);
        if(pos==-1)return new int[]{-1,-1};
        int start=pos;
        int end=pos;
        while(start>0 && nums[start-1]==tar){
            start--; 
        }
        while(end<nums.length-1 && nums[end+1]==tar){
            end++; 
        }
        res[0]=start;
        res[1]=end;

        return res;

       }
        
}

