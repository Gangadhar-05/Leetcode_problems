class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> freq=new HashSet<>();
        for(char c:s.toCharArray()){
            if(freq.contains(c)){
                return c;
            }else{
                freq.add(c);
            }
        }
        return 0;
    }
}
