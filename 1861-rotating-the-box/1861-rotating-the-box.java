class Solution {
    public char[][] rotateTheBox(char[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        char[][] ans=new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-i-1]=mat[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ans));
        for(int j=0;j<n;j++){
            int k=m;
            for(int i=m-1;i>=0;i--){
                if(ans[i][j]=='#'){
                    ans[i][j]='.';
                    ans[k-1][j]='#';
                    k--;
                }else if(ans[i][j]=='*'){
                    k=i;
                }
            }
        }
        return ans;
    }
}