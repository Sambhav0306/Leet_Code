class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] nums=new int[mat.length][mat[0].length];
     for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat[0].length;j++){
             int sum=0;
             if(j-k<0){
                 for(int a=0;a<=j+k && a<mat[0].length;a++){
                     sum+=mat[i][a];
                 }
             }else{
                 for(int a=j-k;a<=j+k && a<mat[0].length;a++){
                     sum+=mat[i][a];
                 }
             }
             nums[i][j]=sum;
         }
     }  
        int[][] ans=new int[nums.length][nums[0].length];
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            int sum=0;
             if(i-k<0){
                 for(int a=0;a<=i+k && a<mat.length;a++){
                     sum+=nums[a][j];
                 }
             }else{
                 for(int a=i-k;a<=i+k && a<mat.length;a++){
                     sum+=nums[a][j];
                 }
             }
             ans[i][j]=sum;
         }
    }
        return ans;
    }
}