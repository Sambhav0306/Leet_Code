class Solution {
    public int getWinner(int[] arr, int k) {
        if(k>arr.length){
            int max=0;
            for(int i=0;i<arr.length;i++){
                max=Math.max(max,arr[i]);
            }
            return max;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        while(true){
            int maxi=Math.max(list.get(0),list.get(1));
            int max=Math.max(list.get(0),list.get(1));
            int count=1;
            while(maxi==max){
                if(count==k) return max;
                int back=0;
                if(list.get(1)>list.get(0)){
                    back=list.get(0);
                    list.remove(0);
                }else{
                    back=list.get(1);
                    list.remove(1);
                }
                list.add(back);
                max=Math.max(list.get(0),list.get(1));
                count++;
            }
        }
        // return -1;
    }
}