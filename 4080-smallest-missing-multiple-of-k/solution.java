class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int num=k;
        while(num>0){
            if(set.contains(num)){
                num+=k;
            }
            else{
                return num;
            }
        }
        return -1;
    }
}
