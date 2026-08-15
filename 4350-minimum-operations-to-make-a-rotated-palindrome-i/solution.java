class Solution {
    public int rCost(String s){
        int l=0;
        int r=s.length()-1;
        int cnt=0;
        while(l<r){
            char left=s.charAt(l);
            char right=s.charAt(r);
            int diff=Math.abs(right-left);
            cnt+=Math.min(diff,26-diff);
            l++;
            r--;
        }
        return cnt;
    }
    public int minOperations(String s) {
        
        int n=s.length();
        int operations=rCost(s);
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(s.substring(i,n));
            sb.append(s.substring(0,i));
            operations=Math.min(i+rCost(sb.toString()),operations);
        }
        
       
        return operations;
    }
}
