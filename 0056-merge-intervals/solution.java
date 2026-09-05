class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n=intervals.length;
        int prevEnd=0;
        int prevSt=0;
        int currSt=0;
        int currEnd=0;

        for(int i=0;i<n;i++){
            if(i==0){
                prevEnd=intervals[i][1];
                prevSt=intervals[i][0];
                continue;
            }
            currSt=intervals[i][0];
            currEnd=intervals[i][1];
            if(currSt<=prevEnd){
                prevEnd=Math.max(currEnd,prevEnd);
            }else{
                list.add(prevSt);
                list.add(prevEnd);

                
                prevSt = currSt;
                prevEnd = currEnd;
               
            }
            

        }
        list.add(prevSt);
             list.add(prevEnd);
        int[][] ans=new int[list.size()/2][2];
        int j = 0;

        for(int i = 0; i < list.size(); i += 2) {
            ans[j][0] = list.get(i);
            ans[j][1] = list.get(i + 1);
            j++;
        }
        return ans;
    }
}
