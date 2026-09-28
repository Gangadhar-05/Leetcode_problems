class Solution {
    public int maxDepth(String s) {
        int mcnt=0;
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                cnt++;
                mcnt=Math.max(mcnt,cnt);
            }else if(c==')'){
                cnt--;
                
            }
        }

        return mcnt;
    }
}