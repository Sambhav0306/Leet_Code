class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int i=1;
        int x=0;
        int y=0;
        for(int j=1;j<=n;j++){
            x+=j;
        }
        while(i!=n){
            y+=i;
            if(x==y) return i;
            x-=i;
            i++;
        }
        return -1;
    }
}