class Solution {
    public int findJudge(int n, int[][] trust) {
        for(int i=1;i<=n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<trust.length;j++){
                if(trust[j][1]==i) set.add(trust[j][0]);
            }
            if(set.size()==n-1){
                if(f(i,trust)) return i;
            }
        }
        return -1;
    }
    public boolean f(int j,int[][] trust){
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==j) return false;
        }
        return true;
    }
} 