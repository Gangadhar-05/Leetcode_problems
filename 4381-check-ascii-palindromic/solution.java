class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder bi =new StringBuilder();
        for(char ch:s.toCharArray()){
            String str= Integer.toBinaryString(ch);
            while(str.length()<8){
                str='0'+str;
                
            }
            bi.append(str);
        }
        int i=0;
        int j=bi.length()-1;
        while(i<j){
            if(bi.charAt(i)!=bi.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
