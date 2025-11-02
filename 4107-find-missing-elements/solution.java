class Solution {
    public boolean Isnotpresent(int tar,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return false;   
            }

        }
                    return true;
    }
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums[0]+1;i<nums[nums.length-1];i++){
           if(Isnotpresent(i,nums)){
               list.add(i);
           }
            
        }
        return list;
        
    }
}
