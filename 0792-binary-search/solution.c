int search(int *arr,int size,int target) {
    int low=0;
    int high=size-1;
    int result=-1;

    
    while (low <=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            result=mid;
            break;

        }else if(arr[mid]<target){
            low=mid+1;
        }
        else if(arr[mid]>target){
            high=mid-1;
        }
        
    }return result;
    
 
}
