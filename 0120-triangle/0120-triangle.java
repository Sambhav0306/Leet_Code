class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int[][] dp=new int[list.size()][list.get(list.size()-1).size()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,0,list,dp);
    }
    public int f(int i,int j,List<List<Integer>> list,int[][] dp){
        if(i==list.size()-1){
            int d=list.get(i).get(j);
            int l=10000;
            if(j!=list.get(i).size()-1){
                l=list.get(i).get(j+1);
            }
            return Math.min(d,l);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down=list.get(i).get(j)+f(i+1,j,list,dp);
        // int left=list.get(i).get(j+1)+;
        int left=10000;
            if(j!=list.get(i).size()-1){
                left=list.get(i).get(j+1)+f(i+1,j+1,list,dp);
            }
            return dp[i][j]=Math.min(down,left);
    }
}