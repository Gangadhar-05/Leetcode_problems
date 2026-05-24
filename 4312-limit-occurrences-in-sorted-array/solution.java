class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
            int cnt=1;
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])cnt++;
            else {cnt=1;}
        if(cnt<=k){
            arr.add(nums[i]);
        }
        }
        int n=arr.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr.get(i);
        }return ans;
    }
}
