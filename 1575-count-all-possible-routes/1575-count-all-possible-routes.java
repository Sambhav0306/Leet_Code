class Solution {
    int fi;
    // HashSet<Integer> set=new HashSet<>();
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        fi=finish;
        long[][] dp= new long[locations.length][fuel+1];
        for(int i=0;i<locations.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=f(start, locations, fuel,dp);
        fi=finish;
        if(start==fi) ans++;
        return (int)(ans%(long)(Math.pow(10,9)+7));
    }
    public long f(int i,int[] nums,int fuel,long[][] dp){
        // if(i==fi) return 1;
        // if(fuel==0) return 0;
        long sum=0;
        if(dp[i][fuel]!=-1) return dp[i][fuel];
        // set.add(i);
        for(int j=0;j<nums.length;j++){
            if(i!=j&& Math.abs(nums[i]-nums[j])<=fuel){
                if(j==fi) sum++;
                sum+=f(j,nums,fuel-Math.abs(nums[i]-nums[j]),dp);
            }
        }
        // set.remove(i);
        return dp[i][fuel]=sum%(long)(Math.pow(10,9)+7);
    }
}