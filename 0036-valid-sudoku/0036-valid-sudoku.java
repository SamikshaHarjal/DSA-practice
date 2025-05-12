class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && !set.add(board[i][j])) {
                    return false;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.' && !set.add(board[j][i])) {
                    return false;
                }
            }
        }
        for (int xl = 0; xl < 9; xl += 3) {
            for (int yl = 0; yl < 9; yl += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int i = xl; i < xl + 3; i++) {
                    for (int j = yl; j < yl + 3; j++) {
                        if (board[i][j] != '.' && !set.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}