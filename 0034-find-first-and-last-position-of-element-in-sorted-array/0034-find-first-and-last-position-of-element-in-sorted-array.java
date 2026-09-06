class Solution {
    public int[] searchRange(int[] nums, int tar) {
        
        int [] res=new int[2];
        int start=-1;
        int end=-1;
        int low = 0;
        int high = nums.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

         if (nums[mid] == tar) {
           start=mid;
           high=mid-1;
        } else if (nums[mid] < tar) {
            low = mid + 1; 
        } else {
            high = mid - 1; 
        }
    }
         low = 0;
         high = nums.length - 1;


    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] ==tar) {
            end=mid; 
            low=mid+1;
        } else if (nums[mid] < tar) {
            low = mid + 1; 
        } else {
            high = mid - 1; 
        }
    }

        
        res[0]=start;
        res[1]=end;

        return res;

       }
        
}