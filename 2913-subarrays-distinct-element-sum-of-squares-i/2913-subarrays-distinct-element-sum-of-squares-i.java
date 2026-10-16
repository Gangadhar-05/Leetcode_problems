class Solution {
    public int dup(int l,int r,List<Integer> arr){
        ArrayList<Integer> list =new ArrayList<>();
        int cnt=0;
        for(int i=l;i<=r;i++){
            if(!list.contains(arr.get(i))){
                cnt++;
                 list.add(arr.get(i));
            }         
        }
        return cnt;
    }
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ssum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int cnt=dup(i,j,nums);
                ssum+=cnt*cnt;
            }
        }
        return ssum;
    }
}