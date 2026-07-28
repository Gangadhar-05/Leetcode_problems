class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wcnt=0;
        
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')wcnt++;
        }
        int min=wcnt;
        int l=0;
        int r=k;
        while(r<blocks.length()){
            if(blocks.charAt(l)=='W')wcnt--;
            if(blocks.charAt(r)=='W')wcnt++;
            if(wcnt==0)return 0;
            min=Math.min(min,wcnt);
            l++;
            r++;
        }
        return min;
        
    }
}
