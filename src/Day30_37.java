public class Day30_37 {
        public void solveSudoku(char[][] board) {
            solve(board);
        }
        public boolean solve(char[][]board){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){

                    if(board[i][j]=='.'){

                        for(char num='1';num<='9';num++){
                            if(isPossible(board,i,j,num)){
                                board[i][j]=num;
                                if(solve(board)){
                                    return true;
                                }
                                else{
                                    board[i][j]='.';
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean isPossible(char[][]board,int row,int col,char c){
            for(int i=0;i<9;i++){
                if(board[i][col]==c) return false;
                if(board[row][i]==c) return false;
                if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c) return false;//checking in each 3 x 3 matrix
            }
            return true;
        }
    }
