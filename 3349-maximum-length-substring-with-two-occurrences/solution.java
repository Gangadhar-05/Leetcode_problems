class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0;
        int max=0;
    
        for(int r=0;r<n;r++){
           map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.get(s.charAt(r))>2){
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                if(left==0){
                    map.remove(left);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            
        }
       return max;
        
    }
}
