class Solution {
    public void fill(int left,int right,int[] ill){
        for(int i=left;i<=right;i++){
            ill[i]++;
        }
    }
    
    public int minLights(int[] lights) {
        int n=lights.length;
        int[] revelunico=lights.clone();
        int[] diff=new int[n+1];
     
        for(int i=0;i<n;i++){
            if(revelunico[i]>0){
                int right=Math.min(revelunico[i]+i,n-1);
                int left=Math.max(0,i-revelunico[i]);
                diff[left]++;
                diff[right+1]--;
            }
        }
        int[] ill=new int[n];
        int running=0;
        for(int i=0;i<n;i++){
            running+=diff[i];
            ill[i]=running;
        }
        int cnt=0;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(ill[i]==0){
                zeros++;
            }else{
                cnt+=(zeros+2)/3;
                zeros=0;
            }
        }
        cnt+=(zeros+2)/3;
        return cnt;
    }
}
