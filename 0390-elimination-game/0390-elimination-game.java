class Solution {
    //recursive
    public int lastRemainingRecursive(int n) {
        return recur(1,n,1,0);                
    }

    private int recur(int l, int r, int step, int dir){
        if(l==r) return l;
        int numOfElements = ((r-l) / step) + 1;
        if( numOfElements % 2 == 1 ){
            return recur(l+step, r-step, step*2, 1-dir);
        }
        return dir==0?recur(l+step,r,step*2,1-dir):recur(l,r-step,step*2,1-dir);
    }

    // iterative
    public int lastRemaining(int n){
        int step = 1, dir = 0;
        int l = 1, r = n;
        while(l!=r){
            int numOfElements = ((r-l) / step) + 1;
            if( numOfElements % 2 == 1 ){
                l+=step;r-=step;
            }else{
                if(dir == 0){
                    l+=step;
                }else{
                    r-=step;
                }
            }
            step*=2;
            dir=1-dir;     
        }
        return l;
    }
    
}