class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            String s=details[i];
            int x=s.charAt(11)-'0';
            int y=s.charAt(12)-'0';
            if((x*10)+y>60) cnt++;
        }
        return cnt;
    }
}
