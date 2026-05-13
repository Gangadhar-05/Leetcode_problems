class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String S=new String(s1);
        String T=new String(s2);
        return S.equals(T);
    }
}
