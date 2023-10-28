class Solution {
    public int countVowelPermutation(int n) {
     long  ans=0;
     long[][] dp=new long[150][n+1];
        for(int i=0;i<150;i++){
            Arrays.fill(dp[i],-1);
        }
     char[] arr={'a','e','i','o','u'};
     for(int i=0;i<arr.length;i++){
         int ch=arr[i];
         ans+=f(arr[i],n-1,dp);
     }
        ans=ans%(int)(Math.pow(10,9)+7);
        return (int)(ans);
    }
    public long f(char c,int n,long[][] dp){
        if(n==0) return 1;
        int ch=c;
        if(dp[ch][n]!=-1) return dp[ch][n];
        long a=0;
        if(c=='a') a=f('e',n-1,dp);
        long e=0;
        long ii=0;
        long o=0;
        long u=0;
        if(c=='e'){
            char[] arr={'a','i'};
            for(int i=0;i<arr.length;i++){
                e+=f(arr[i],n-1,dp);
            }
        }
        if(c=='i'){
            char[] arr={'a','e','o','u'};
            for(int i=0;i<arr.length;i++){
                ii+=f(arr[i],n-1,dp);
            }
        }
        if(c=='o'){
            char[] arr={'i','u'};
            for(int i=0;i<arr.length;i++){
                o+=f(arr[i],n-1,dp);
            }
        }
        if(c=='u') u=f('a',n-1,dp);
        return dp[ch][n]=(a+e+ii+o+u)%(int)(Math.pow(10,9)+7);
    }
}