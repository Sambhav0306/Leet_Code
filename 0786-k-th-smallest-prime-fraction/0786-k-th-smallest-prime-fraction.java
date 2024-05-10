class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Double> pq=new PriorityQueue<>();
        int nums[] =new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                double a=(double)((double)arr[i]/(double)arr[j]);
                pq.add(a);
            }
        }
        double ans=0;
        while(k!=0){
            k--;
            ans=pq.poll();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                double check=(double)arr[i]/(double)arr[j];
                if(check==ans) {
                    nums[0]=arr[i];
                    nums[1]=arr[j];
                    return nums;
                }
            }
        }
        return nums;
    }
}