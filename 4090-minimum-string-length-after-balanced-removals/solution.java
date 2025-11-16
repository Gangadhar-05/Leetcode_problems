class Solution {
    public int minLengthAfterRemovals(String s) {
       if(s.length()==1)return 1;
        int acnt=0;
        int bcnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                acnt++;
            }else{
                bcnt++;
            }
     }
        return Math.abs(acnt-bcnt);
    }
}
