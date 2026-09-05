class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length())return false;
      int[] freq=new int[26];
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
      }
      for(int i:freq){
        if(i!=0)return false;
      }
      return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        ArrayList<List<String>> ans=new ArrayList<>();
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            visited[i]=true;

            for(int j=i+1;j<n;j++){
                if(!visited[j]&&isAnagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    visited[j]=true;
                }
            }
            ans.add(temp);
        }
      return ans;
    }
}
