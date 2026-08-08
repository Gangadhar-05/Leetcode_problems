class Solution {
    public void makeRowZeros(int x, int matrix[][], int c) {
        for (int k = 0; k < c; k++) {
            matrix[x][k] = 0;
        }
    }

    public void makeColsZeros(int y, int matrix[][], int r) {
        for (int k = 0; k < r; k++) {
            matrix[k][y] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        
        for (int x : rows) {
            makeRowZeros(x, matrix, c);
        }

        
        for (int x : cols) {
            makeColsZeros(x, matrix, r);
        }
    }
}
