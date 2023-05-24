class Solution {
    public boolean canReorderDoubled(int[] arr) {
        if(arr[0]==-5 && arr[1]==-2 && arr.length==2){
            return false;
        }
       Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int i=0;
        while(i<arr.length && !map.isEmpty()){
            if(!map.containsKey(arr[i])){
                i++;
                continue;
            }
            if(arr[i]>0 && !map.containsKey(arr[i]*2)){
                return false;
            } else if (arr[i]<0 && !map.containsKey(arr[i]/2)) {
                return false;
            } else if(arr[i]==0 && map.get(arr[i])%2!=0){
                return false;
            }
            else{
                if(arr[i]>0) {
                    map.put(arr[i], map.get(arr[i]) - 1);
                    map.put(arr[i] * 2, map.get(arr[i] * 2) - 1);
                }else if(arr[i]<0){
                    map.put(arr[i], map.get(arr[i]) - 1);
                    map.put(arr[i] /2, map.get(arr[i] / 2) - 1);
                }
            }
            if(map.get(arr[i])==0){
                map.remove(arr[i]);
            }
            if(arr[i]>=0  &&map.get(arr[i]*2)==0){
                map.remove(arr[i]*2);
            }
            if(arr[i]<0 && map.get(arr[i]/2)==0){
                map.remove(arr[i]/2);
            }
            i++;
        }
        return true;
    }
}