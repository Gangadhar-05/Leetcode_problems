class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        List<Integer> res=new ArrayList<>();

        for (int len = 2; len <= 9; len++) {
             for (int start = 1; start <= 10 - len; start++) {
                   int num = 0;
                    for (int d = start; d < start + len; d++) {
                            num = num * 10 + d;
                          }
       list.add(num);
                    }
                 }     

         for(int n:list){
            if(n>=low && n<=high){
                res.add(n);
            }
         }
         return res;
    }
}
