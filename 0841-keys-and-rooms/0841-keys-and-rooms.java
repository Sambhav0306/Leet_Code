class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] nums=new boolean[rooms.size()];
        Arrays.fill(nums,false);
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<rooms.get(0).size();i++){
            queue.offer(rooms.get(0).get(i));
//            nums[rooms.get(0).get(i)]=true;
        }
//        nums[0]=true;
        while(queue.size()!=0){
            int si=queue.size();
            while(si!=0){
                int a=queue.poll();
                    if(!nums[a]){
                        nums[a]=true;
                        for(int i=0;i<rooms.get(a).size();i++){
                            queue.offer(rooms.get(a).get(i));
//                        nums[rooms.get(a).get(i)]=true;
                        }
                    }
                si--;
            }
        }
        nums[0]=true;
        for(int i=0;i<nums.length;i++){
            if(!nums[i]) return false;
        }
        return true;
    }
}