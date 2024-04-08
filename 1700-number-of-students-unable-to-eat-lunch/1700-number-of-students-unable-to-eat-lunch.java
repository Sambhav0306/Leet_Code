class Solution {
    public int countStudents(int[] students, int[] nums) {
        Queue<Integer> queue=new LinkedList<>();
        for(int k:students){
            queue.add(k);
        } 
        int j=0;
        while(true){
            int counter=0;
            if(queue.size()==0) return 0;
            int i=queue.size();
            while(i!=0){
                if(queue.peek()==nums[j]){
                    // i--;
                    i--;
                    j++;
                    counter++;
                    queue.poll();
                }else{
                    int a=queue.poll();
                    queue.add(a);
                    i--;
                }
            }
            if(counter==0) return queue.size();
        }
        // return queue.size();
    }
}