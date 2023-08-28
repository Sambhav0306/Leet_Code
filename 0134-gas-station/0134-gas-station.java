class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1){
            if(gas[0]>=cost[0]) return 0;
        }
        int[] arr=new int[gas.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=gas[i]-cost[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                continue;
            }
            int sum=arr[i];
            int j=i+1;
            int k=i+1;
            while(j!=i){
                if(sum<0){
                    break;
                }
                if(j==arr.length){
                    j=0;
                    if(i==0){
                        break;
                    }
                }
                sum+=arr[j];
                j++;
            }
            if(i==j && sum>=0) return i;
        }
        return -1;
    }
}