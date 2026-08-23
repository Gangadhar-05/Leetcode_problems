class Solution {
   
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();

        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=lower;i<=upper;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return res;
        }
        int st=list.get(0);
        int end=list.get(0);
        
        for(int i=1;i<list.size();i++){
            
            if(list.get(i)-list.get(i-1)==1){
                end=list.get(i);
            }else{
                res.add(Arrays.asList(st,end));
                st=list.get(i);
                end=list.get(i);
            }
            
        }
        res.add(Arrays.asList(st,end));
        return res;
    }
}
