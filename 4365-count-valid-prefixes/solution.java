class Solution {
    public boolean check(String s){
        int ocnt=0;
        int zcnt=0;
        for(char c:s.toCharArray()){
            if(c=='0'){
                zcnt++;
            }else{
                ocnt++;
            }
        }
        return (Math.abs(ocnt-zcnt)<=1);
    }
    public int countValidPrefixes(String s) {
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(check(s.substring(0,i+1)))cnt++;
        }
        return cnt;
    }
}
