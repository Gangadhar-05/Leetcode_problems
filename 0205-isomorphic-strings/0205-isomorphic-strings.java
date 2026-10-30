class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> smap=new HashMap<>();
        HashMap<Character,Character> tmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(smap.containsKey(a)&&smap.get(a)!=b){
                return false;
            }
            if(tmap.containsKey(b)&&tmap.get(b)!=a){
                return false;
            }
            smap.put(a,b);
            tmap.put(b,a);
        }
        return true;

        
    }
}