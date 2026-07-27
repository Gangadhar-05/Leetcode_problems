class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel=new HashMap<>();
        HashMap<Character,Integer> cons=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }else{
                cons.put(ch,cons.getOrDefault(ch,0)+1);

            }
        }
        int vmax=0;
        int cmax=0;
        for(int val:vowel.values()){
            vmax=Math.max(vmax,val);
        }
        for(int val:cons.values()){
            cmax=Math.max(cmax,val);
        }

        return vmax+cmax;
    }
}
