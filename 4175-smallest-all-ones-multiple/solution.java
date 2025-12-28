class Solution {
    public int minAllOneMultiple(int k) {
        int n=k;
        if(n%2==0 || n%5==0)return -1;
        int r=0;
        for(int i=1;i<=n;i++){
            r=(r*10+1)%n;
            if(r==0){
                return i;
            }
        }
        return -1;
    }
}
