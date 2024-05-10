class Solution {
    public int longestStrChain(String[] words) {
        int max=1;
        Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));
        int[][] dp=new int[words.length][words.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=1;i<words.length;i++){
            max=Math.max(max,f(i-1,i,words,dp)+1);
        }
        return max;
    }
    public  int f(int prev,int curr,String[] words,int[][] dp){
        if(curr==words.length) return 0;
        if(dp[prev][curr]!=-1) return dp[prev][curr];
        int not_take=f(prev,curr+1,words,dp);
        int take=0;
        if(words[prev].length()==words[curr].length()-1){
            String s=words[prev];
            String t=words[curr];
            int count=0;
            int i=0;
            int j=0;
            while(i<words[prev].length() && j<words[curr].length()){
                if(s.charAt(i)!=t.charAt(j)){
                    count++;
                    j++;
                }else{
                    i++;
                    j++;
                }
            }
            if(count==1 || count==0) take=1+f(curr,curr+1,words,dp);
        }
        return dp[prev][curr]=Math.max(take,not_take);
    }
}