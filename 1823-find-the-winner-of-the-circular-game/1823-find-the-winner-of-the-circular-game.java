class Solution {
    public int findTheWinner(int n, int k) {
        HashSet<Integer> set=new HashSet<>();
        int i=1;
        while(set.size()!=n-1){
            int count=0;
            while(count!=k) {
                if (i > n) {
                    i = 1;
                }
                if (set.contains(i)) {
                    i++;
                } else {
                    count++;
                    if(count==k){
                        set.add(i);
                        break;
                    }
                    i++;
                }
            }
        }
        for(int j=1;j<=n;j++){
            if(!set.contains(j)){
                return j;
            }
        }
        return 1;
    }
}