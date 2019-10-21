import java.util.HashSet;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Assume board size is always 9x9 and every box contains valid character
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            columns[i] = new HashSet<>();
            rows[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (rows[i].contains(board[i][j]) ||
                        columns[j].contains(board[i][j]) ||
                        boxes[(i/3)*3+j/3].contains(board[i][j]))
                        return false;
                    rows[i].add(board[i][j]);
                    columns[j].add(board[i][j]);
                    boxes[(i/3)*3+j/3].add(board[i][j]);
                }
            }
        }
        
        return true;
    }
}