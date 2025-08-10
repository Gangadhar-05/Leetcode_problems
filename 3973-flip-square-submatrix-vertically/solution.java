class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        
        for (int i = 0; i < k / 2; i++) {
     
            for (int j = 0; j < k; j++) {
                
                int row1 = x + i;
                int row2 = x + k - 1 - i;

               
                int temp = grid[row1][y + j];
                grid[row1][y + j] = grid[row2][y + j];
                grid[row2][y + j] = temp;
            }
        }
        return grid;
    }
}
