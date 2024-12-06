class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       int count=0;
        int sum=0;
        Arrays.sort(banned);
        for(int i=1;i<=n;i++){
            int counter=0;
            if(sum>maxSum){
                break;
            }
            for(int j=0;j<banned.length && banned[j]<=i;j++){
                if(i==banned[j]){
                    counter++;
                    break;
                }
            }
            if(counter==0){
                sum=sum+i;
                count++;
            }
        }
        if(sum<=maxSum){
            return count;
        }
        return count-1;
    }
}