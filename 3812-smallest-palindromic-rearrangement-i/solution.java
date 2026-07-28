class Solution {
    public String getLeft(String s){
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                sb.append((char)('a' + i));
            }
        }
        return sb.toString();
    }
    public String smallestPalindrome(String s) {
        int n=s.length();
        char mid=s.charAt(n/2);

        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String sorted=new String(arr);

        String left=getLeft(sorted);

        StringBuilder ans=new StringBuilder(left);
        if(n%2==1){
            ans.append(mid);
        }
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}
