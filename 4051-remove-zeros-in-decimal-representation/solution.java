class Solution {
    public long removeZeros(long n) {
        if(n==1) return 1;
        String str=Long.toString(n);
        String result=str.replace("0","");
        long answer=Long.parseLong(result);
        return answer;
        
       
        
    }
}
