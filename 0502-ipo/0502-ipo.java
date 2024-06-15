class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int arr[][]=new int[profits.length][2];
        int j=0;
        for(int i[]:arr){
            i[0]=profits[j];
            i[1]=capital[j];
            j++;
        }
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int arr1[],int arr2[]){
                if(arr1[1]==arr2[1]){
                    return arr2[0] - arr1[0];
                }
                else return arr1[1] - arr2[1];
            }
        });
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(k>0){
            while(i<profits.length && arr[i][1]<=w){
                
                pq.offer(arr[i][0]);
                i++;
            }
            if(pq.isEmpty()){break;}
            w+=pq.poll();
            k--;
        }
        return w;
    }
}
