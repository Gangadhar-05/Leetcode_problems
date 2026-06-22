/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
     public int findPeakElement(MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        while(low<high){
            int mid = low + (high - low) / 2;
        if(mountainArr.get(mid)>mountainArr.get(mid+1)){
            high=mid;
        }else{
            low=mid+1;
        }
        } 
          return low;
    }
   
    public int search(MountainArray arr, int target,int left ,int right) {
       

    while(left <= right){

    int mid = left + (right - left) / 2;

    if(arr.get(mid) == target)
        return mid;

    else if(arr.get(mid) < target)
        left = mid + 1;

    else
        right = mid - 1;
    }
     return -1;
             
    }
    public int searchDesc(MountainArray arr, int target, int left, int right) {

    while(left <= right){

        int mid = left + (right - left) / 2;

        if(arr.get(mid) == target)
            return mid;

        else if(arr.get(mid) < target)
            right = mid - 1;  

        else
            left = mid + 1;   
    }

    return -1;
}

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeakElement(mountainArr);
        int res=search(mountainArr,target,0,peak);
        if(res==-1){
           return res=searchDesc(mountainArr,target,peak+1,mountainArr.length() - 1);
        }
        return res;
    }
}
