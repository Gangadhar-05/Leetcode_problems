class Solution {
    public boolean isSpecial(int[][] arr,int a,int b,int m,int n){
        if(arr[a][b] != 1) return false; 
        for(int i=0;i<m;i++){
            if( i != a && arr[i][b]==1)return false;
        }
         for(int j=0;j<n;j++){
            if(j != b && arr[a][j]==1)return false;
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isSpecial(mat,i,j,m,n))
                cnt++;
            }
        }
        return cnt;
        
    }
}
