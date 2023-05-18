class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int j=0;
            HashSet<Character> set=new HashSet<>();
            while(j<9){
                if(set.contains(board[j][i])){
                    return false;
                }else if(board[j][i]!='.'){
                    set.add(board[j][i]);
                }
                j++;
            }
        }
        for(int i=0;i<9;i++){
            int j=0;
            HashSet<Character> set=new HashSet<>();
            while(j<9){
                if(set.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
                j++;
            }
        }
        for(int i=2;i<9;i=i+3){
            for(int j=2;j<9;j=j+3){
                 HashSet<Character> set=new HashSet<>();
                for(int a=i-2;a<=i;a++){
                    for(int b=j-2;b<=j;b++){
                        if(set.contains(board[a][b])){
                    return false;
                }else if(board[a][b]!='.'){
                    set.add(board[a][b]);
                }
                    }
                }
            }
        }
        return true;
    }
}