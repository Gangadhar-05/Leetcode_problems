class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            while(nums[i]>0){
                list.add(nums[i+1]);
                nums[i]=nums[i]-1;
            }

        }
        int[] res=new int[list.size()];
        int j=0;
        for(int val:list){
            res[j++]=val;
        }
        return res;
    }
}
