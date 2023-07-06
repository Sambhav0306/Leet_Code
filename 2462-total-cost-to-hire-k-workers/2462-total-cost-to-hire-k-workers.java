class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        int i=0;
        int j=costs.length-1;
        long cost=0;
        while(i<=j && candidates!=0){
            pq1.offer(costs[i]);
            if(i!=j){
                pq2.offer(costs[j]);
            }
            i++;
            j--;
            candidates--;
        }
        if(i>j){
            while(k!=0){
                if(pq1.size()==0){
                    cost+=pq2.poll();
                } else if (pq2.size()==0) {
                    cost += pq1.poll();
                } else if(pq2.peek()<pq1.peek()){
                    cost+=pq2.poll();
                    if(i<=j){
                        pq2.offer(costs[j]);
                        j--;
                    }
                }else{
                    cost+=pq1.poll();
                    if(i<=j){
                        pq1.offer(costs[i]);
                        i++;
                    }
                }
                k--;
            }
        }
        while(i<=j && k!=0){
            if(pq1.size()==0){
                cost+=pq2.poll();
            } else if (pq2.size()==0) {
                cost += pq1.poll();
            } else if(pq2.peek()<pq1.peek()){
                cost+=pq2.poll();
                if(i<=j){
                    pq2.offer(costs[j]);
                    j--;
                }
            }else{
                cost+=pq1.poll();
                if(i<=j){
                    pq1.offer(costs[i]);
                    i++;
                }
            }
            k--;
        }
        if(i>j){
            while(k!=0){
                if(pq1.size()==0){
                    cost+=pq2.poll();
                } else if (pq2.size()==0) {
                    cost += pq1.poll();
                } else if(pq2.peek()<pq1.peek()){
                    cost+=pq2.poll();
                    if(i<=j){
                        pq2.offer(costs[j]);
                        j--;
                    }
                }else{
                    cost+=pq1.poll();
                    if(i<=j){
                        pq1.offer(costs[i]);
                        i++;
                    }
                }
                k--;
            }
        }
        return cost;
    }
}