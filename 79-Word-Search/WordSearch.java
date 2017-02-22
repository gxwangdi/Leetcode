public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length==0 || word == null || word.length() == 0) {
            return false;
        }
        
        // board is not a square matrix.
        int m = board.length;
        int n = board[0].length;
        boolean[][] isVisited = new boolean[m][n]; 
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (isMatch(board, i, j, isVisited, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isMatch(char[][] board, int x, int y, boolean[][] isV, String word, int prog) {
        if (word.charAt(prog) != board[x][y]) {
            return false;
        }
        // note the order to avoid OutOfIndexException.
        prog++;
        if (prog >= word.length()) {
            return true;
        }
        isV[x][y] = true;
        if (x > 0 && !isV[x-1][y] && isMatch(board, x-1, y, isV, word, prog)) {
            return true;
        }
        if (x+1 < board.length && !isV[x+1][y] && isMatch(board, x+1, y, isV, word, prog)) {
            return true;
        }
        if (y > 0 && !isV[x][y-1] && isMatch(board, x, y-1, isV, word, prog)) {
            return true;
        }
        if (y+1 < board[0].length && !isV[x][y+1] && isMatch(board, x, y+1, isV, word, prog)) {
            return true;
        }
        // revert isV[x][y], means pop from stack to upper level of recursion. 
        isV[x][y] = false;
        return false;
    }// end of isMatch      
}




