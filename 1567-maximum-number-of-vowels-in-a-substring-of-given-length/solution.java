class Solution {
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public int maxVowels(String s, int k) {
        int cnt=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))cnt++;
        }
        max=Math.max(cnt,max);

        int l=0;
        int r=k;
        while(r<s.length()){
            if(isVowel(s.charAt(l)))cnt--;
            if(isVowel(s.charAt(r)))cnt++;
            max=Math.max(cnt,max);
            l++;
            r++;
        }
        return max;

        
    }
}
