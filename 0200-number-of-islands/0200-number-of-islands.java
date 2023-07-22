class Pair{
    int fm;
    int sm;
    Pair(int fm,int sm){
        this.fm=fm;
        this.sm=sm;
    }
} 
class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        boolean[][] check=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !check[i][j]){
                    bfs(i,j,check,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i,int j,boolean[][] check,char[][] grid){
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(i,j));
        while(!queue.isEmpty()){
            int a=queue.peek().fm;
            int b=queue.peek().sm;
            queue.poll();
            if(a-1>=0 && grid[a-1][b]=='1' && !check[a-1][b]){
               queue.add(new Pair(a-1,b)); 
                check[a-1][b]=true;
            }
            if(b-1>=0 && grid[a][b-1]=='1' && !check[a][b-1]){
               queue.add(new Pair(a,b-1));  
                check[a][b-1]=true;
            }
            if(a+1<grid.length && grid[a+1][b]=='1' && !check[a+1][b]){
                queue.add(new Pair(a+1,b));
                check[a+1][b]=true;
            }
            if(b+1<grid[0].length && grid[a][b+1]=='1' && !check[a][b+1]){
                queue.add(new Pair(a,b+1));
                check[a][b+1]=true;
            }
        }
    }
}