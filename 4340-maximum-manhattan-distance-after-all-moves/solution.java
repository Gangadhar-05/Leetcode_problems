class Solution {
    public int maxDistance(String moves) {
        int l=0;
        int r=0;
        int u=0;
        int d=0;
        int bl=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                u++;
            }else if(c=='D'){
                d++;
            }else if(c=='L'){
                l++;
            }else if(c=='R'){
                r++;
            }else{
                bl++;
            }
        }
        int mdis=Math.abs(r-l)+Math.abs(u-d)+bl;
        return mdis;
    }
}
