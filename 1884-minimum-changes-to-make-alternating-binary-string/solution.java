class Solution {
    public int chance(String s,char ch){
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i%2==0 && s.charAt(i)!=ch)res++;
            else if(i%2==1 && s.charAt(i)==ch)res++;
        }
        return res;
    }
    public int minOperations(String s) {
       int ans1=chance(s,'0');
       int ans2=chance(s,'1');
       return Math.min(ans1,ans2);
        
    }
}
