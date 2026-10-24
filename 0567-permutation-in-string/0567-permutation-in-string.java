class Solution {
    public String sortString(String s) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
    }
    public boolean checkInclusion(String s1, String s2) {
        s1=sortString(s1);
        int n=s1.length();
        for(int i=0;i<=s2.length()-n;i++){
            String str=sortString(s2.substring(i,i+n));
            if(s1.equals(str))return true;
        }
        return false;
    }
}