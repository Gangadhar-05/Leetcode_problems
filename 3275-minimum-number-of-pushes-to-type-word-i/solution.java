class Solution {
    public int minimumPushes(String word) {
        // int l=word.length();
        // if(l<=8)return l;
        // int r=0;
        // if(l%8==0){
        //     r=l/8;
        // }else{
        //     r=(l/8)+1;
        // }
        // int cnt=0;
        // for(int i=1;i<=r;i++){
        //     if(l<8){
        //         cnt+=l*i;
        //     }else{
        //         l-=8;
        //          cnt+=(8*i);
        //     }
           
        // }
        // return cnt;
        int ans=0;
        for(int i=0;i<word.length();i++){
            ans+=(i/8)+1;
        }
        return ans;
    }
}
