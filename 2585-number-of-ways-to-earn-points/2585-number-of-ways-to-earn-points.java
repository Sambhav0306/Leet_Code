class Solution {
    public int waysToReachTarget(int target, int[][] types) {
        int[][][] dp=new int[types.length][target+1][51];
        for(int i=0;i<types.length;i++) {
            for (int j = 0; j <= target; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(target,types.length-1,types[types.length-1][0],types,dp);
    }
    public int f(int target,int i,int k,int[][] types,int[][][] dp){
        if(i==0){
            if(target==0|| (target%types[0][1]==0 && target/types[0][1]<=types[0][0])){
                return 1;
            }
            return 0;
        }
        if(dp[i][target][k]!=-1){
            return dp[i][target][k];
        }
        int not_take=f(target,i-1,types[i-1][0],types,dp);
        int take=0;
        if(k!=0 && target>=types[i][1]){
//            types[i][0]=types[i][0]-1;
            take=f(target-types[i][1],i,k-1,types,dp);
        }
        return dp[i][target][k]=(take+not_take)%(int)(Math.pow(10,9)+7);
    }
}