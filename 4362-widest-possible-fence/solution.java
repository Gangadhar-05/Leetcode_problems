class Solution {
    public int maximumWidth(int[] planks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int p:planks){
            map.merge(p,1,Integer::sum);
        }
        Integer[] values=map.keySet().toArray(new Integer[0]);
        int n=values.length;
        Map<Long,Integer> pairSum=new HashMap<>();
        for(int i=0;i<n;i++){
            int val1=values[i];
            for(int j=i+1;j<n;j++){
                int val2=values[j];
                long sum=(long)val1+val2;
                int temp=Math.min(map.get(val1),map.get(val2));
                pairSum.merge(sum,temp,Integer::sum);
            }
            int cnt=map.get(val1);
            if(cnt>=2){
                long ssum=(long)val1*2;
                pairSum.merge(ssum,cnt/2,Integer::sum);
            }
        }
        Set<Long> set=new HashSet<>();
        for(int key:map.keySet())set.add((long)key);
        set.addAll(pairSum.keySet());
        int max=1;
        for(long x:set){
            int total=0;
            if(x<=Integer.MAX_VALUE && map.containsKey((int)x)){
                total+=map.get((int)x);
            }
            total+=pairSum.getOrDefault(x,0);
            max=Math.max(max,total);
        }
        return max;
    }
}
