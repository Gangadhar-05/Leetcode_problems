class Solution {
    public int maxPower(String s) {
        char[] arr=s.toCharArray();
        int n=s.length();
        int cnt=1;
        int maxCnt=1;
        
        for(int i=1;i<=n-1;i++){
            if(arr[i]==arr[i-1]){
                cnt++;   
            }
            else{
                cnt=1;
            }
            maxCnt=Math.max(cnt,maxCnt);
        }
  return maxCnt;
    }
}
