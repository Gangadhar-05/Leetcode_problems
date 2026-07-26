class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int s1=series1.length;
        int s2=series2.length;
        int s=s1+s2;
        int[] stamps=new int[s];
        int k=0;
        for(int i=0;i<s1;i++){
            stamps[k++]=series1[i][0];
        }
        for(int i=0;i<s2;i++){
            stamps[k++]=series2[i][0];
        }
        Arrays.sort(stamps);
        ArrayList<Integer> unq=new ArrayList<>();
        for(int t:stamps){
            if(unq.isEmpty()|| unq.get(unq.size()-1)!=t){
                unq.add(t);
            }
        }
        int size=unq.size();
        int[] arr1=new int[size];
        int[] arr2=new int[size];

        int n1=0;
        for(int i=0;i<size;i++){
            if(n1<s1 && unq.get(i)==series1[n1][0]){
                arr1[i]=series1[n1][1];
                n1++;
            }
        }
        int n2=0;
        for(int i=0;i<size;i++){
            if(n2<s2 && unq.get(i)==series2[n2][0]){
                arr2[i]=series2[n2][1];
                n2++;
            }
        }
        for(int i=size-2;i>=0;i--){
            if(arr1[i]==0){
                arr1[i]=arr1[i+1];
            }
            if(arr2[i]==0){
                arr2[i]=arr2[i+1];
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<size;i++){
            List<Integer> list=new ArrayList<>();
            list.add(unq.get(i));
            list.add(arr1[i]+arr2[i]);
            res.add(list);
            
            
        }
        return res;
        
        
        
    }
}
