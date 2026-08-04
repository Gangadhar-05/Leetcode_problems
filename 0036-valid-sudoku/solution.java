class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<r;i++){     
            map.clear();
            for(int j=0;j<c;j++){
                if (board[i][j] == '.') continue;

                if(map.containsKey(board[i][j]))return false;
            
                map.put(board[i][j],1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int j = 0; j < c; j++) {   
             map2.clear();

        for (int i = 0; i < r; i++) {  
             if (board[i][j] == '.') continue;

             if (map2.containsKey(board[i][j])) return false;

        map2.put(board[i][j], 1);
             }
        }
        for (int row = 0; row < 9; row += 3) {
    for (int col = 0; col < 9; col += 3) {

        HashMap<Character, Integer> map3 = new HashMap<>();

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                if (board[i][j] == '.') continue;

                if (map3.containsKey(board[i][j])) return false;

                map3.put(board[i][j], 1);
            }
        }
    }
}


     return true;
        
    }
}
