class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(f(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean f(char[][] board,String word,int i,int j,int k){
         if(k==word.length()){
            return true;
        }
        if(i<0 ||j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
        if(board[i][j]!=word.charAt(k)){
            return false;
        }else{
              char a=board[i][j];
              board[i][j]='1';
              boolean up=f(board,word,i-1,j,k+1);
              boolean down=f(board,word,i+1,j,k+1);
              boolean left=f(board,word,i,j-1,k+1);
              boolean right=f(board,word,i,j+1,k+1);
              board[i][j]=a;
              return up|down|right|left;
        }
    } 
}