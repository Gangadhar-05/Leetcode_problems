class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int cnt=0;
        int cnt2=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               if(i==j || i+j==grid.length-1){
                if(grid[i][j]==0)cnt++;
               }else{
                if(grid[i][j]!=0)cnt2++;
               }
            }
        }
        if(cnt==0 && cnt2==0) return true;
        else return false;
    }
}
