class Solution {
    public boolean validDigit(int n, int x) {
        String s =Integer.toString(n);
        if(s.charAt(0)==(char)(x +'0'))return false;
        if(s.contains(String.valueOf(x))){
            return true;
        }
        return false;
    }
}
