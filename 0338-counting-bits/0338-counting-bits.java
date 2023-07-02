class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        if(n==0){
            return arr;
        }
        arr[1]=1;
        if(n==1){
            return arr;
        }
        for(int i=2;i<=n;i++){
            int a=i;
            a=i&i-1;
            int count=1;
            count+=arr[a];
            arr[i]=count;
        }
        return arr;
    }
}