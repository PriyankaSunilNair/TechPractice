class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] subs = new int[9];
        
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (isNumber(board[i][j])) {
                    int n = board[i][j] - '0';
                    if (((rows[i] >> n) & 1) == 1) return false;
                    if (((cols[j] >> n) & 1) == 1) return false;
                    if (((subs[(i / 3) * 3 + (j / 3)] >> n) & 1) == 1) return false;
                    
                    rows[i] |= (1 << n);
                    cols[j] |= (1 << n);
                    subs[(i / 3) * 3 + (j / 3)] |= (1 << n);
                }
            }
        }
        return true;
    }
    
    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }
}