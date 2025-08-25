class Solution {
    public String firstPalindrome(String[] words) {
        for(String w:words){
            if(ispal(w)) return w;
        }
        return "";

    }

        private boolean ispal(String s){
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
            return true;
        }
    
}
