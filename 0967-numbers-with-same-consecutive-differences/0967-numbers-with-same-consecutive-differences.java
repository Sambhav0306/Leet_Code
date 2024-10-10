class Solution {
    HashSet<Integer> set=new HashSet<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<=9;i++){
            f(i,i,k,n-1);
        }
        int[] arr=new int[set.size()];
        int j=0;
        for(int i:set){
            arr[j]=i;
            j++;
        }
        return arr;
    }
    public void f(int i,int num,int k,int n){
        if(n==0){
            set.add(num);
            return;
        }
        if(i+k<=9) {
            int a=num*10+i+k;
            f(i+k,a,k,n-1);
        }
        if(i-k>=0){
            int a=num*10+i-k;
            f(i-k,a,k,n-1);
        }
        return;
    }
}