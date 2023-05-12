class Solution {
    public int[] sumZero(int n) {
       int m=-(n/2);
       int []arr=new int[n];
       if(n%2!=0){
           for(int i=0;i<n;i++){
               arr[i]=m;
               m=m+1;
           }
       } 
       else{
           for(int i=0;i<n;i++){
               if(m==0){
                   m=m+1;
               }
               arr[i]=m;
               m=m+1;
           }
       }
       return arr;
    }
}