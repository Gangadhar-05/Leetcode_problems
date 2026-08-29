class Solution {
public int gcd(int a,int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
    public int maxValidSplits(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int r=-1;r<n;r++){
            int m=(r==-1)?n:n-1;
            if(m<2)continue;
            int[] arr=new int[m];
            int k=0;
            for(int i=0;i<n;i++){
                if(i!=r){
                    arr[k++]=nums[i];
                }
            }

            
        int[] pref=new int[m];
        int[] suf=new int[m];
        pref[0]=arr[0];
        for(int i=1;i<m;i++){
            pref[i]=gcd(pref[i-1],arr[i]);
        }
        suf[m-1]=arr[m-1];
        for(int i=m-2;i>=0;i--){
            suf[i]=gcd(suf[i+1],arr[i]);
        }
            int cnt=0;
        for(int i=0;i<m-1;i++){
            if(pref[i]==suf[i+1]){
                cnt++;
            }
        }
            ans=Math.max(ans,cnt);
        }
        return ans;
        
    }
}
