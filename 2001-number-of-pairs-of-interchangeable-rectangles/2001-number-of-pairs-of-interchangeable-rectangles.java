class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long> map=new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            double a=(rectangles[i][0]/(double)(rectangles[i][1]));
            if(!map.containsKey(a)){
                map.put(a,(long)1);
            }else{
                map.put(a,(map.get(a)+1));
            }
        }
        long count=0;
        while(true){
            if(map.size()==0){
                break;
            }
            long a=0;
            double key=-1;
            for(double i: map.keySet()){
                if(a<map.get(i)) {
                    key=i;
                    a=map.get(i);
                }
            }
//            a=map.get(key);
            map.remove(key);
            if(a==1){
                break;
            }
            long l = a*(a - 1) / 2;
            count+=l;
        }
        return  count;
    }
}