class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] fr=new int[26];
        for(char c:s.toCharArray()){
            fr[c-'a']++;
        }
        StringBuilder a=new StringBuilder();
        for(int i=0;i<26;i++){
            char c=(char)('a'+i);
            if(c==x || c==y)continue;
            while(fr[i]-->0){
                a.append(c);
            }
            while(fr[y-'a']-->0){
                a.append(y);
            }
            while(fr[x-'a']-->0){
                a.append(x);
            }

        }
                    return a.toString();
    }
}
