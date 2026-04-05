class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        char[] arr=moves.toCharArray();
        int l=0;
        int r=0;
        int d=0;
        int u=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='L')l++;
            else if(arr[i]=='R')r++;
             else if(arr[i]=='U')u++;
              else d++;
        }
        if(Math.abs(l-r)==0 && Math.abs(u-d)==0)return true;
        else return false;
        
    }
}
