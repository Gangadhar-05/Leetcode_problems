class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<matches.length;i++){
            set.add(matches[i][0]);
            int val=matches[i][1];
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(int x:set){
            if(!map.containsKey(x)){
                list1.add(x);
            }
        }
        for(int x:map.keySet()){
            if(map.get(x)==1){
                list2.add(x);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        res.add(list1);
        res.add(list2);
        return res;
    }
}
