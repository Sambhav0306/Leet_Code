class Solution {
    public boolean wordBreak(String s, List<String> string) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return f(0,s,string,dp);
    }
    public boolean  f(int i,String s,List<String> string,int[] dp){
        if(i==s.length()) return true;
        if(dp[i]!=-1){
            if(dp[i]==0) return false;
            return true;
        }
        boolean not_take=false;
        boolean take=false;
        for(int j=0;j<string.size();j++){
            String t=string.get(j);
            if(s.indexOf(t,i)==i){
                take=f(i+t.length(),s,string,dp);
                if(take) break;
            }
        }
        if(take|not_take) dp[i]=1;
        else dp[i]=0;
        return take|not_take;
    }
}