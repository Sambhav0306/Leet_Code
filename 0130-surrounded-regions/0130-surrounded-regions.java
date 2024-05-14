class Solution {
    public void solve(char[][] board) {
        for(int j=0;j<board[0].length;j++){
            if(board[0][j]=='O') f(0,j,board);
            if(board[board.length-1][j]=='O') f(board.length-1,j,board);
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O') f(i,0,board);
            if(board[i][board[0].length-1]=='O') f(i,board[0].length-1,board);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='C') board[i][j]='O';
            }
        }
    }
    public void f(int i,int j,char[][] board){
        if(i<0 || j<0 || i==board.length || j==board[0].length ) return ;
        board[i][j]='C';
        if(i+1<board.length && board[i+1][j]=='O') f(i+1,j,board);
        if(i-1>=0 &&board[i-1][j]=='O') f(i-1,j,board);
        if(j+1<board[0].length && board[i][j+1]=='O') f(i,j+1,board);
        if(j-1>=0 &&board[i][j-1]=='O') f(i,j-1,board);
        return;
    }
}