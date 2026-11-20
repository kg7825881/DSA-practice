class Solution {
    public boolean isSafe(char[][] board, int row, int col){
        for(int i=0; i<9 ;i++){
            if(i != row && board[i][col] == board[row][col]){
                return false;
            }
            if(i != col && board[row][i] == board[row][col]){
                return false;
            }
        }

        int nrow = (row/3) * 3;
        int ncol = (col/3) * 3;
        for(int i=nrow; i<nrow+3; i++){
            for(int j=ncol; j<ncol+3; j++){
                if((i != row || j != col) && (board[i][j] == board[row][col])){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nr = 0;
        int nc = 0;
        if(col != board[0].length - 1){
            nr = row;
            nc = col + 1;
        } else {
            nr = row + 1;
            nc = 0;
        }

        if(board[row][col] != '.'){
            if(isSafe(board, row, col)){
                return helper(board, nr, nc);
            } else {
                return false;
            }
        }

        return helper(board, nr, nc);
    }
    public boolean isValidSudoku(char[][] board) {
        return helper(board, 0, 0);
    }
}