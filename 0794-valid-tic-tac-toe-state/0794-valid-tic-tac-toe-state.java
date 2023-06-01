class Solution {
    public boolean validTicTacToe(String[] board) {
        if (board == null || board.length == 0) {
            return false;
        }

        int n = board.length;
        int diag1 = 0;
        int diag2 = 0;
        int turnsDiff = 0;
        boolean xWin = false;
        boolean oWin = false;
        char c;

        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                c = board[i].charAt(j);
                if (c == 'X') {
                    row++;
                    turnsDiff++;
                } else if (c == 'O') {
                    row--;
                    turnsDiff--;
                }
                c = board[j].charAt(i);
                if (c == 'X') {
                    col++;
                } else if (c == 'O') {
                    col--;
                }
            }
            c = board[i].charAt(i);
            if (c == 'X') {
                diag1++;
            } else if (c == 'O') {
                diag1--;
            }
            c = board[i].charAt(n - 1 - i);
            if (c == 'X') {
                diag2++;
            } else if (c == 'O') {
                diag2--;
            }
            if (row == n || col == n || diag1 == n || diag2 == n) {
                if (oWin) {
                    return false;
                }
                xWin = true;
            }
            if (row == -n || col == -n || diag1 == -n || diag2 == -n) {
                if (xWin) {
                    return false;
                }
                oWin = true;
            }
        }
        if (turnsDiff < 0 || turnsDiff > 1) {
            return false;
        }
        if ((turnsDiff == 0 && xWin) || (turnsDiff == 1 && oWin)) {
            return false;
        }
        return true;
    }
}