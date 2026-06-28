class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(x,y)->x[0]-y[0]);
        ArrayList<int[]> mer=new ArrayList<>();
        mer.add(occupiedIntervals[0]);
    for(int i=1;i<occupiedIntervals.length;i++){
        int[] l=mer.get(mer.size()-1);
        int[] cur=occupiedIntervals[i];
        if(cur[0]<=l[1]+1){
            l[1]=Math.max(l[1],cur[1]);
        }else{
            mer.add(cur);
        }
    }
        List<int[]> resonway=mer;
        List<List<Integer>> res=new ArrayList<>();
        for(int[] interval:resonway){
            int st=interval[0],end=interval[1];
            if(freeEnd<st || freeStart>end){
                res.add(Arrays.asList(st,end));
                continue;
            }
            if(st<freeStart){
                res.add(Arrays.asList(st,freeStart-1));
            }
            if(end>freeEnd){
                res.add(Arrays.asList(freeEnd+1,end));
            }
            
        }
        return res;
    }
}
