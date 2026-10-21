class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if((ch>='A' && ch<='Z')||
            (ch>='a' && ch<='z') ||
            (ch>='0' && ch<='9')
            ){
                ans+=ch;
            }
        }
        ans=ans.toLowerCase();
        int l=0;
        int r=ans.length()-1;
        while(l<r){
            if(ans.charAt(l)!=ans.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}