class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set=new HashSet<>();
        int i=1;
        int sum=0;
        while(n!=0){
            if(set.contains(i)){
                i++;
                continue;
            }
            sum+=i;
            set.add(k-i);
            i++;
            n--;
        }
        return sum;
    }
}